package LeetCodeTryQues;

import java.util.Arrays;

public class ShuffleArrayPractice {
    public static void main(String[] args) {
        int[] nums ={2,5,1,3,4,7};
        int n = 3;
        System.out.println(Arrays.toString(shuffle(nums, n)));
    }
    public static int[] shuffle(int[] nums, int n) {
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        int[] arr = new int[2*n];
        for(int i=0;i<n;i++)
        {
            arr1[i]=nums[i];
            arr2[i]=nums[n+i];
        }
        for(int j=0;j<2*n;j++)
        {
            if(j%2==0)
            {
                arr[j]=arr1[j/2];
            }
            else {
                arr[j]=arr2[j/2];
            }
        }
        return arr;
    }
}
