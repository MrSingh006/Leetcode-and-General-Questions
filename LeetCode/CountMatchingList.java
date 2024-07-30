package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountMatchingList {
    public static void main(String[] args)
    {
        List<String> item1 = Arrays.asList("phone","blue","pixel");
        List<String> item2 = Arrays.asList("computer","silver","lenovo");
        List<String> item3 = Arrays.asList("phone","gold","iphone");

        List<List<String>> items = new ArrayList<List<String>>();
        items.add(item1);
        items.add(item2);
        items.add(item3);

        System.out.println(items);
        String ruleKey = "color";
        String ruleValue = "silver";

        System.out.println(countMatches(items,ruleKey,ruleValue));
    }

    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count =0;
        for(int i=0; i<items.size();i++)
        {
            if(ruleKey.equalsIgnoreCase("type") && items.get(i).get(0).equalsIgnoreCase(ruleValue))
            {
                count++;
            }
            if(ruleKey.equalsIgnoreCase("color") && items.get(i).get(1).equalsIgnoreCase(ruleValue))
            {
                count++;
            }
            if(ruleKey.equalsIgnoreCase("name") && items.get(i).get(2).equalsIgnoreCase(ruleValue))
            {
                count++;
            }
        }
        return count;
    }
}
