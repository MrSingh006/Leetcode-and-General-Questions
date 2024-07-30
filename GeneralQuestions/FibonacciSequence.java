package GeneralQuestions;

import java.util.Arrays;

public class FibonacciSequence {
    public static void main(String[] args) {
        int num =10;
        fibonacci(num);
    }

    private static void fibonacci(int num) {
        int[] arr = new int[num];
        arr[0] = 1;
        arr[1] = 1;
        for(int i =1;i<num-1;i++)
        {
            arr[i+1]=arr[i]+arr[i-1];
        }
        System.out.println(Arrays.toString(arr));
    }
}
