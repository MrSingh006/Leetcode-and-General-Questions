package LeetCode;

import java.util.Arrays;

public class ShuffleTheArray {
    public static void main(String[] args) {
//        int[] nums = {2,5,1,3,4,7};
//        int n = 3;
        int[] nums = {1,2,3,4,4,3,2,1};
        int n = 4;
        int[] arr = shuffle(nums,n);
        System.out.println(Arrays.toString(arr));
    }
    public static int[] shuffle(int[] nums, int n) {
        int arr[] = new int[2*n];
        for(int i=0;i<n;i++)
        {
            arr[2*i] = nums[i];
            arr[2*i+1] = nums[n+i];
        }
        return arr;
    }
}
