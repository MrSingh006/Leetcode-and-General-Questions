package LeetCode;

import java.util.Arrays;

public class ConcatenationOfArray {
    public static void main(String[] args) {

        int[] nums = {3,2,1};
        int[] ans = getConcatenation(nums);
        concat(nums);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] getConcatenation(int[] nums) {
        int[] ans =new int[2*nums.length];
        for(int i=0;i<2*nums.length;i++)
        {
            if(i<nums.length)
            {
                ans[i]=nums[i];
            }
            else {
                ans[i]=nums[i-nums.length];
            }
        }
      return ans;
    }


    /**
     * Optimized
     */
    public static void concat(int[] nums) {
        int[] ans =new int[2*nums.length];
        for(int i=0; i<nums.length; i++) {
            ans[i] = nums[i];
            ans[i+nums.length] = nums[i];
        }
        System.out.println(Arrays.toString(ans));
    }

}
