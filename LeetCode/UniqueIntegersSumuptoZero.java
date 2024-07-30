package LeetCode;

import java.util.Arrays;

public class UniqueIntegersSumuptoZero {
    public static void main(String[] args) {
        int n = 5;
//        sumZero(n);
        System.out.println(Arrays.toString(sumZero(n)));
        System.out.println(Arrays.toString(sumZeroBruteForce(n)));
    }
    public static int[] sumZero(int n) {
        int[] arr = new int[n];
        for(int i =0;i<arr.length;i++)
        {
            arr[i] = i*2-n+1;
        }
        return arr;
    }

    public static int[] sumZeroBruteForce(int n) {
        int[] arr = new int[n];
        int count = n;
        if(n==1)
        {
            arr[0]=0;
            return arr;
        }
        else
        {
            if(n%2==0)
            {
                for(int i=0;i<n/2;i++)
                {
                    arr[i]=count;
                    arr[n-i-1]=-count;
                    count--;
                }
            }
            else
            {
                arr[0]=0;
                for(int i=1;i<=(n-1)/2;i++)
                {
                    arr[i]=count;
                    arr[n-i]=-count;
                    count--;
                }
            }
        }
        return arr;
    }
}
