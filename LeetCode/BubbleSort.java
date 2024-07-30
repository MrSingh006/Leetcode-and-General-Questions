package LeetCode;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = {6, 3, 0, 5,2};
        System.out.println(Arrays.toString(arr));
        int sorted[] = sort(arr);
        System.out.println(Arrays.toString(sorted));
    }
    public static int[] sort(int arr[])
    {
        for(int i=0; i<arr.length-1;i++)
        {
            for(int j=0;j<arr.length-i-1;j++)
            {
                if(arr[j]<arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr [j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }
}
