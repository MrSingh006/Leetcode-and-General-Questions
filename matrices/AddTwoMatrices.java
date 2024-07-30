package matrices;

import java.util.Arrays;

public class AddTwoMatrices {
    public static void main(String[] args) {
        addition();
    }
    public static void addition()
    {
        int[][] a =new int[3][3];
        int[][] b =new int[3][3];
        int[][] c =new int[3][3];

        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
                a[i][j] = 10;
            }
        }
        for(int i=0;i<b.length;i++)
        {
            for(int j=0;j<b[i].length;j++)
            {
                b[i][j] = 20;
                c[i][j] = a[i][j] + b[i][j];
            }
        }
        System.out.println(Arrays.deepToString(a));
        System.out.println(Arrays.deepToString(b));
        System.out.println(Arrays.deepToString(c));
    }
}
