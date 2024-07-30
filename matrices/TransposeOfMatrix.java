package matrices;

import java.util.Arrays;
import java.util.Scanner;

public class TransposeOfMatrix {

    public static void main(String[] args) {
        transpose();
    }
    public static <scanner> void transpose()
    {
        int[][] a = new int[3][3];
        int[][] b =new int[3][3];
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter 9 values : ");
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println(Arrays.deepToString(a));
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
                b[i][j] = a[j][i];
            }
        }
        System.out.println(Arrays.deepToString(b));
    }

}
