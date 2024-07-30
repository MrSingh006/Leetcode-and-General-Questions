package LeetCode;

import java.math.BigInteger;
import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
//        int[] digits = {7,2,8,5,0,9,1,2,9,5,3,6,6,7,3,2,8,4,3,7,9,5,7,7,4,7,4,9,4,7,0,1,1,1,7,4,0,0,6};
        int[] digits = {5,6,6,9};
//        ComplexSolutionplusOne(digits);
        plusOne(digits);
    }

    private static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                System.out.println(Arrays.toString(digits));
                return digits;

            }
            digits[i] = 0;
        }

        digits = new int[digits.length + 1];
        digits[0] = 1;
        System.out.println(Arrays.toString(digits));
        return digits;
    }

    public static int[] ComplexSolutionplusOne(int[] digits) {
        StringBuffer concat=new StringBuffer();
        for(int i=0;i<digits.length;i++)
        {
            concat.append(digits[i]);
        }
        BigInteger num = new BigInteger(String.valueOf(concat));
        BigInteger one = new BigInteger(String.valueOf(1));
        BigInteger n = num.add(one);
        System.out.println(concat);
        System.out.println(num);
        String s = n.toString();
        int[] res = new int[s.length()];
        for(int i=0;i<s.length();i++)
        {
            res[i]=Integer.parseInt(s.valueOf(s.charAt(i)));
                            // OR
//            res[i]=s.charAt(i) - '0';
        }
        System.out.println(Arrays.toString(res));
        return res;
    }
}
