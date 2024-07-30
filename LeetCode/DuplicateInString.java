package LeetCode;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateInString {
    public static void main(String[] args) {
        String str = "Paurav";
        simpleDuplicateString(str);
    }

    private static void simpleDuplicateString(String str) {
        char[] charArray = str.toCharArray();
        Map<Character, Integer> countDuplicateMap = new HashMap<>();
        for(Character c : charArray)
        {
            if(countDuplicateMap.containsKey(c))
            {
                countDuplicateMap.put(c,countDuplicateMap.get(c)+1);
            }
            else {
                countDuplicateMap.put(c,1);
            }
        }
        // for printing
        Set<Map.Entry<Character,Integer>> setMap = countDuplicateMap.entrySet();
        for(Map.Entry<Character,Integer> entry : setMap)
        {
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
    }
}
