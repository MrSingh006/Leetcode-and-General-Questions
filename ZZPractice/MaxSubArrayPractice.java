package ZZPractice;

public class MaxSubArrayPractice {
    public static void main(String[] args) {
//        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int[] nums = {5,4,-1,7,8};
//        int[] nums = {-1,-2};
        int maxSum = maxSubArrayPractice(nums);
        System.out.println(maxSum);
    }
    // Kadane's algorithm
    private static int maxSubArrayPractice(int[] nums) {
        int max =Integer.MIN_VALUE;
        int sum=0;
        for(int i =0;i<nums.length-1;i++){
            if(sum<0)
            {
                sum=nums[i];
            }
            else{
                sum=sum+nums[i];
            }
            if(sum>max)
            {
                max=sum;
            }
        }
        return max;
    }
}
