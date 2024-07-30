package LeetCodeTryQues;

import java.util.Arrays;

public class PlusOnePractice {
    public static void main(String[] args) {
        int[] digits = {9,9,9,9};
        System.out.println(Arrays.toString(plusOne(digits)));
//        System.out.println(Arrays.toString(plusOneBruteForce(digits)));
    }
    public static int[] plusOne(int[] digits) {
        for(int i=digits.length-1;i>=0;i--)
        {
            if(digits[i]<9)
            {
                digits[i]++;
                return digits;
            }
            digits[i]=0;
        }
        digits = new int[digits.length+1];
        digits[0] =1;
        return digits;
    }

    public static int[] plusOneBruteForce(int[] digits) {
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<digits.length;i++)
        {
            sb.append(digits[i]);
        }
        Integer num = Integer.parseInt(String.valueOf(sb))+1;
        String result = num.toString();
        int[] arr = new int[result.length()];
        for(int j= 0;j<result.length();j++)
        {
            arr[j] = Integer.parseInt(String.valueOf(result.charAt(j)));
        }
        System.out.println(num);
        return arr;
    }
}
