package LeetCodeTryQues;

import java.util.Arrays;

public class USumZeroPractice {
    public static void main(String[] args) {
        int n =8;
        System.out.println(Arrays.toString(sumZero(n)));
    }
    public static int[] sumZero(int n) {
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
