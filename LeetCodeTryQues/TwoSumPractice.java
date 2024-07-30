package LeetCodeTryQues;

import java.util.Arrays;

public class TwoSumPractice {
    public static void main(String[] args) {
        int[] nums ={5,2,6,7};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }
    public static int[] twoSum(int[] nums, int target)
    {
        int[] arr = new int[2];
        int i,j;
        for(i=0;i<nums.length;i++)
        {
            boolean flag = false;
            for(j=i+1;j<nums.length;j++)
            {
                if(nums[i] + nums[j] == target)
                {
                    flag = true;
                }
                if(flag)
                {
                    arr[0]=i;
                    arr[1]=j;
                    break;
                }
            }
        }
        return arr;
    }
}
