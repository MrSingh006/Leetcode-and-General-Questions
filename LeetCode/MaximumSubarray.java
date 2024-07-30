package LeetCode;

import java.util.Arrays;

public class MaximumSubarray {
    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
//        int[] nums = {5,4,-1,7,8};
//        int[] nums = {-1,-2};
        
        int maxSum=maxSubArrayUsingFunctions(nums);
        System.out.println(maxSum);
    }
    public static int maxSubArrayOwnLogic(int[] nums) {

        int InnerMaxSum=0;
        int InnerMaxSumNegative=Arrays.stream(nums).min().getAsInt();
        int OuterMaxSum=0;
        int OuterMaxSumNegative = InnerMaxSumNegative;
        Arrays.stream(nums).min().getAsInt();
        for(int i=0;i<nums.length;i++)
        {
            int sum=0;
            for(int j=i;j<nums.length;j++)
            {
                sum=sum+nums[j];
                if(sum>InnerMaxSum)
                {
                    InnerMaxSum=sum;
                }
                if(sum<=0)
                {
                    if(sum>=InnerMaxSumNegative)
                    {
                        InnerMaxSumNegative=sum;
                    }

                }
            }
            if(InnerMaxSum>OuterMaxSum)
            {
                OuterMaxSum = InnerMaxSum;
            }
            if(InnerMaxSum<=0)
            {
                if(InnerMaxSumNegative>OuterMaxSumNegative)
                {
                    OuterMaxSumNegative=InnerMaxSumNegative;
                }

            }
        }
        if (OuterMaxSum>0)
            return OuterMaxSum;
        else
            return OuterMaxSumNegative;
    }

    public static int maxSubArray(int[] nums) {
        int max =Integer.MIN_VALUE;
        int sum=0;
        for (int i =0;i<nums.length;i++)
        {
            sum=sum+nums[i];
            if(sum>max)
            {
                max=sum;
            }
            if(sum<0)
            {
                sum =0;
            }
        }
        return max;
    }

    public static int maxSubArrayUsingFunctions(int[] nums) {
        int max =Integer.MIN_VALUE;
        int sum=0;
        for (int i =0;i<nums.length;i++)
        {
            sum=sum+nums[i];
            max=Math.max(max,sum);
            sum=Math.max(sum,0);
        }
        return max;
    }
}
