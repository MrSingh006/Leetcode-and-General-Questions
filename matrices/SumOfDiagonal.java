package matrices;

import java.util.Arrays;

public class SumOfDiagonal {
    public static void main(String[] args) {
//        int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};
//        int[][] mat = {{1,1,1,1},{1,1,1,1},{1,1,1,1},{1,1,1,1}};
        int[][] mat = {{5}};
        SumOfDiagonal sd =new SumOfDiagonal();
        sd.diagonalSum(mat);
    }
    public int diagonalSum(int[][] mat) {
        int sum1=0;
        int sum2=0;
        int sum=0;
        int index=mat.length-1;
        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat[i].length;j++)
            {
                if(i==j)
                {
                    int temp =mat[i][j];
                    sum1 = temp+sum1;
                }
            }
        }
        for(int i=0;i<mat.length;i++)
        {
            for(int j=mat[i].length-1-i;j>=index;j--)
            {
                if(!(i==j))
                {
                    int temp =mat[i][j];
                    sum2 = temp+sum2;
                }
            }
            index--;
        }
        System.out.println(Arrays.deepToString(mat));
        System.out.println(sum1);
        System.out.println(sum2);
        sum=sum1+sum2;
        System.out.println(sum);
        return sum;
    }
}
