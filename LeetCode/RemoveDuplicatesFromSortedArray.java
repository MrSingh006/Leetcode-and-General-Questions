package LeetCode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] nums ={0,0,1,1,1,2,2,3,3,4};
        int ans =removeDuplicates(nums);
        System.out.println(ans);
    }
    public static int removeDuplicates(int[] nums)
    {
        if(nums.length == 0)
            return 0;
        int addIndex = 1;
        for(int i = 0; i < nums.length - 1; i++)
        {
            if(nums[i] < nums[i + 1])
            {
                nums[addIndex] = nums[i + 1];
                addIndex++;
            }
        }
        return addIndex;
    }
}
