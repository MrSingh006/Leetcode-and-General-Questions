package Infosys.round2;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateCharactersInString {
    public static void main(String[] args) {
        String str = "swiss";
        findDuplicate(str);
//        firstSingleEntry(str);
//        usingLinkedHashMap(str);
    }

    private static void usingLinkedHashMap(String str) {
        char[] ch = str.toCharArray();
        Map<Character,Integer> lhMap = new LinkedHashMap<>();
        for(Character c: ch)
        {
            if(lhMap.containsKey(c))
            {
                lhMap.put(c,lhMap.get(c)+1);
            }
            else {
                lhMap.put(c,1);
            }
        }
        System.out.println("Linked hash Map contains : "+lhMap);
        Set<Map.Entry<Character, Integer>> entries = lhMap.entrySet();
        for(Map.Entry m: entries)
        {
            if((Integer) m.getValue() == 1)
            {
                System.out.println("First Non Duplicate : "+m);
                break;
            }
        }
    }

    private static void firstSingleEntry(String str) {
        char[] ch = str.toCharArray();
        Map<Character,Integer> map = new HashMap<>();
        for(Character c : ch)
        {
            if(map.containsKey(c))
            {
                map.put(c,map.get(c)+1);
            }
            else {
                map.put(c,1);
            }
        }
        System.out.println("firstSingleEntry complete map : "+map);

        for(Character c: ch){
            if(map.get(c) == 1)
            {
                System.out.println("First non duplicate : "+c);
                break;
            }
        }
    }

    private static void findDuplicate(String str) {
        char[] ch = str.toCharArray();
        Map<Character,Integer> map = new HashMap<>();
        for(Character c: ch)
        {
            if(map.containsKey(c))
            {
                map.put(c,map.get(c)+1);
            }
            else
            {
                map.put(c,1);
            }
        }
        System.out.println("Map with count : "+map);

        Set<Map.Entry<Character,Integer>> entry = map.entrySet();
        for(Map.Entry m : entry)
        {
            if((Integer) m.getValue()>1)
            {
                System.out.println("Greater map : "+m);
            }

        }
    }
}
