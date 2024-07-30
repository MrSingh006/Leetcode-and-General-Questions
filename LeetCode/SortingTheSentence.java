package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class SortingTheSentence {
    public static void main(String[] args) {
        String s= "Myself2 Me1 I4 and3";
        System.out.println(sortSentence(s));
    }
    public static String sortSentence(String s) {
        String[] arr = s.split(" ");
        Integer index = 0;
        String onlyWord;
        Map<Integer,String> map = new HashMap<>();
        for(String str : arr)
        {
            index = Integer.parseInt(str.replaceAll("[^0-9]",""));
            onlyWord= str.replaceAll("[0-9]","");
            map.put(index,onlyWord);
        }
        StringBuffer sb = new StringBuffer();
        for(int i=1;i<=arr.length;i++)
        {
            sb.append(map.get(i)+" ");
        }
        return sb.toString().trim();
    }
}
