package LeetCode;

import java.util.Arrays;

public class ZeroBasedPermutation {
    public static void main(String[] args) {
//        int[] nums = {0,2,1,5,3,4};
        int[] nums = {5,0,1,2,3,4};
        ZeroBasedPermutation zsb = new ZeroBasedPermutation();
        int[] ans=zsb.buildArray(nums);
        System.out.println(Arrays.toString(ans));
    }

    public int[] buildArray(int[] nums) {
        int[] ans =new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            ans[i]=nums[nums[i]];
        }
        return ans;
    }
}


