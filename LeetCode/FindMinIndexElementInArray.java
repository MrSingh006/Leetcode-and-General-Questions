package LeetCode;

import java.util.Arrays;

public class FindMinIndexElementInArray {
    public static void main(String[] args) {
        int[] arr = {4,5,12,87,0,1,6};
        findMinElement(arr);
    }
    public static void findMinElement(int[] arr)
    {
        int index=0;
        int min = arr[0];
        for(int i =0;i<arr.length;i++)
        {
            if(min>arr[i])
            {
                min = arr[i];
                index = i;
            }
        }
        System.out.println(min+" : "+index);
    }
}
