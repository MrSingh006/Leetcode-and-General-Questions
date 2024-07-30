package LeetCode;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int nums[] = {1,2,3,5};
//        containsDuplicate(nums);
        boolean flag = dupSet(nums);
        System.out.println(flag);
    }

    /**
     * By Paurav
     * @param nums
     * @return
     */
    public static boolean containsDuplicate(int[] nums) {
        boolean flag =false;
        for(int i=0;i< nums.length;i++)
        {
            for(int j=i+1;j< nums.length;j++)
            {
                if(nums[i]==nums[j])
                {
                    flag=true;
                    break;
                }
            }
        }
        System.out.println(flag);
        return  flag;
    }

    /**
     * By Anuj
     * @param nums
     * @return
     */
    public static boolean containDup(int[] nums) {

        boolean flag = false;
        for(int i=0; i<nums.length; i++) {
            for(int j=0; j<nums.length; j++) {

                if(i != j && nums[i] == nums[j]) {
                    flag =  true;
                }
            }
        }
        return flag;
    }

    public static boolean dupSet(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int i=0; i<nums.length; i++)
        {
            if(!set.add(nums[i])) {
                return true;
            }
        }
        return false;
    }

}
