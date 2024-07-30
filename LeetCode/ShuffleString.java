package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class ShuffleString {
    public static void main(String[] args) {
        String s = "codeleet";
        int[] indices = {4,5,6,7,0,2,1,3};
        System.out.println(restoreString(s,indices));
        System.out.println(restoreStringFast(s,indices));
    }
    public static String restoreString(String s, int[] indices) {
        char[] c = s.toCharArray();
        Map<Integer,Character> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i<indices.length;i++)
        {
            map.put(indices[i],c[i]);
        }
        for(int i = 0;i<map.size();i++)
        {
            sb.append(map.get(i));
        }

        return sb.toString();
    }

    public static String restoreStringFast(String s, int[] indices) {
        char[] result = new char[indices.length];
        for (int i = 0; i < indices.length; i++)
        {
            result[indices[i]] = s.charAt(i);
        }
        return new String(result);
    }
}
