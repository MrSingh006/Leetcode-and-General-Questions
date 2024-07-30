package ZZPractice;

import java.util.Arrays;

public class LongestCommonPrefixPractice {
    public static void main(String[] args) {
        String[] strs={"flower","flow","flight"};
        String s=longestCommonPrefixBrute(strs);
        System.out.println(s);

        String res =longestCommonPrefix(strs);
        System.out.println("Result is : "+res);

    }

    private static String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        System.out.println(Arrays.toString(strs));
        String s1= strs[0];
        String s2= strs[(strs.length-1)];
        StringBuilder sb =new StringBuilder();
        for(int i=0;i<s1.length()&&i<s2.length();i++)
        {
            if(s1.charAt(i)==s2.charAt(i))
            {
                sb.append(s1.charAt(i));
            }
            else
            {
                break;
            }
        }
        if (sb.isEmpty())
        {
            return "";
        }
        else
        {
            return sb.toString();
        }
    }

    private static String longestCommonPrefixBrute(String[] strs) {
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<strs.length-1;i++)
        {
            for(int j=0;j<strs[i].length() && j<strs[i+1].length();j++)
            {
                if(strs[i].charAt(j)==strs[i+1].charAt(j))
                {
                    sb.append(strs[i].charAt(j));
                }
            }
        }
        if(sb.isEmpty())
        {
            return "No match";
        }
        else return sb.toString();
    }
}
