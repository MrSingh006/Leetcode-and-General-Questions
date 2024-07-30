package matrices;

import java.util.Arrays;
import java.util.List;

public class LuckyNumberPractice {
    public static void main(String[] args) {
        int[][] matrix = {{3,7,8},{9,11,13},{15,16,17}};
        LuckyNumberPractice lnum = new LuckyNumberPractice();
        lnum.luckyNumbers(matrix);
    }

    public List<Integer> luckyNumbers (int[][] matrix) {
        int rowIndex=0;
        int columnIndex=0;
        int[] getMinOfEachRow =new int[matrix.length];
        for(int i=0;i<matrix.length;i++)
        {
            int min = matrix[i][0];
            int[] getMaxofEachColumn = new int[matrix[i].length];
            int max = matrix[0][i];
            for (int j = 0; j < matrix[i].length; j++)
            {
                if (min >= matrix[i][j])
                {
                    min=matrix[i][j];
                    getMinOfEachRow[i] = min;
                    rowIndex=i;
                    columnIndex=j;
                }

                if (max <= matrix[i][j])
                {
                    max=matrix[i][j];
                    getMaxofEachColumn[i] = max;
                    rowIndex=i;
                    columnIndex = j;
                }

            }
            System.out.println("For minimum : "+rowIndex+":"+columnIndex);
            System.out.println("For maximum : "+rowIndex+":"+columnIndex);
            System.out.println(Arrays.toString(getMaxofEachColumn));
        }
        System.out.println(Arrays.toString(getMinOfEachRow));
        return null;
    }
}
