package matrices;

import java.util.Arrays;

public class MultiplicationOfMatrices {
    public static void main(String[] args) {
        multiplication();
    }
    public static void multiplication()
    {
        int[][] a = new int[3][3];
        int[][] b = new int[3][3];
        int[][] c = new int[3][3];
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
                a[i][j] = 10;
                b[i][j] = 20;
            }
        }
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
                c[i][j] = a[i][j]*b[j][i];
            }
        }
        System.out.println(Arrays.deepToString(a));
        System.out.println(Arrays.deepToString(b));
        System.out.println(Arrays.deepToString(c));
    }

}
