package matrices;

import java.util.Arrays;
import java.util.Scanner;

public class AddingElementsToMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write the number that you want to add to matrix : ");
        int n = sc.nextInt();
        int a[][] = addingDataToMatrix(n);
        System.out.println(Arrays.deepToString(a));
    }
    public static int[][] addingDataToMatrix(int n)
    {
        int arr[][] =new int[3][3];
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                arr[i][j] = n;
            }
        }
        return arr;
    }
}
