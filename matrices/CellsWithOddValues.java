package matrices;

import java.util.Arrays;

public class CellsWithOddValues {
    public static void main(String[] args) {
//        int m=2;
//        int n=3;
//        int[][] indices = {{0,1},{1,1}};
        int m=2;
        int n=2;
        int[][] indices = {{1,1},{0,0}};
        oddCells(m, n, indices);
    }

    private static int oddCells(int m, int n, int[][] indices) {
        int[][] mat = new int[m][n];
        for(int i=0; i<indices.length; i++){
            //increment all the cells on row
            int row = indices[i][0];
            for(int k=0; k<n; k++){
                mat[row][k]++;
            }
            //increment all the cells on column
            int col = indices[i][1];
            for(int k=0; k<m; k++){
                mat[k][col]++;
            }
        }
        int count =0;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(mat[i][j]%2 != 0)
                    count++;
            }
        }
        return count;
    }

    public static int bruteForceOddCells(int m, int n, int[][] indices) {
        int[][] arr = new int[m][n];
        int a = indices[0][0];
        int b = indices[0][1];
        int c = indices[1][0];
        int d = indices[1][1];
        for (int i = 0; i < n; i++) {
            arr[a][i] += 1;
        }
        for (int i = 0; i < m; i++) {
            arr[i][b] += 1;
        }
        for (int i = 0; i < n; i++) {
            arr[c][i] += 1;
        }
        for (int i = 0; i < m; i++) {
            arr[i][d] += 1;
        }
        int count = 0;
        for (int i = 0; i < m; i++)
        {
            for (int j = 0; j < n; j++)
            {
                if(arr[i][j]%2!=0)
                {
                    count++;
                }
            }
        }

//        System.out.println(Arrays.deepToString(arr));
//        System.out.println(count);
        return count;
    }
}
