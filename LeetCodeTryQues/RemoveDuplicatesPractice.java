package LeetCodeTryQues;

import java.util.*;
import java.util.stream.Collectors;

public class RemoveDuplicatesPractice {
    public static void main(String[] args) {
        int[] nums={0,0,1,1,1,2,2,3,3,4};
        removeDuplicates(nums);
    }

    public static Set<int[]> removeDuplicates(int[] nums) {

        Set<int[]> setArray = new HashSet<>(Arrays.asList(nums));
        System.out.println(setArray.toString());
        return setArray;

    }
}
