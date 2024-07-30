package LeetCode;

import java.util.Arrays;

public class TwoSums {
    public static void main(String[] args) {
        int nums[] = {3,2,4};
        int target = 6;
//        int nums[] = {5,2,6,7};
//        int target = 9;
//        int[] arr=twoSum(nums,target);
//        System.out.println(Arrays.toString(arr));
        int[] arrPointer=twoPointer(nums,target);
        System.out.println(Arrays.toString(arrPointer));
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] arr = new int[2];
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                int x = nums[i]+nums[j];
                if(x==target)
                {
                    arr[0]=i;
                    arr[1]=j;
                }
            }
        }
        return arr;
    }

    /**
     * Two pointer approach
     */
    private static int[] twoPointer(int[] nums, int target) {
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        int[] arr =new int[2];
        int min =0;
        int max= nums.length-1;
        int sum=0;
        while(min<max)
        {
            sum=nums[min]+nums[max];
            if(sum==target)
            {
                arr[0] = min;
                arr[1] = max;
                return arr;
            }
            else if (sum<target)
            {
                min++;
            }
            else if (sum>target)
            {
                max--;
            }
        }
        return arr;
    }
}
