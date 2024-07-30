package LeetCodeTryQues;

import java.util.Arrays;

public class LongestCommonPractice {
    public static void main(String[] args) {
        String[] strs = {"dog","racecar","car"};
        System.out.println(longestCommonPrefix(strs));
    }

    public static String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        System.out.println(Arrays.toString(strs));
        String s1 = strs[0];
        String s2 = strs[strs.length-1];
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s1.length() && i<s2.length();i++)
        {
            if(s1.charAt(i)==s2.charAt(i))
            {
                sb.append(s1.charAt(i));
            }
            else {
                break;
            }
        }
        if(sb.isEmpty())
        {
            return "";
        }
        else{
            return sb.toString();
        }
    }

}
