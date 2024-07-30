package LeetCode;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter number");
        int num = sc.nextInt();
        fibonacciLogic(num);
    }

    private static void fibonacciLogic(int num) {
        int[] arr = new int[num];
        arr[0]=1;
        arr[1]=1;
        for(int i=1;i<num-1;i++)
        {
            arr[i+1]=arr[i]+arr[i-1];
        }
        System.out.println(arr[num-1]);

    }
}
