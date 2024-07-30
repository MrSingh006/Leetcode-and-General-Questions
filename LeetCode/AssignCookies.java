package LeetCode;

import java.util.Arrays;

public class AssignCookies {
    public static void main(String[] args) {
        long[] g = {1,2,3};
        long[] s = {1,2,3,4,5,6,7,8,9};
        System.out.println(findContentChildren(g, s));
    }
    public static int findContentChildren(long[] g, long[] s) {
        int i = 0;
        Arrays.sort(g);
        Arrays.sort(s);
        for(int j=0; i<g.length  && j<s.length; j++)
        {
            if(s[j]>=g[i])
            {
                i++;
            }
        }
        return i;
    }
}
