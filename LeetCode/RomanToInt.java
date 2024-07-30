package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class RomanToInt {
    public static void main(String[] args) {
        String s = "M";
        System.out.println(romanToInt(s));
    }
    public static int romanToInt(String s) {
        Map<Character,Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        int num = 0;
        char[] ch = s.toCharArray();

        for(int i =0;i<ch.length;i++)
        {
            num += map.get(ch[i]);
            if (i >= 1) {
                if (ch[i - 1] == 'I' && (ch[i] == 'V' ||  ch[i] == 'X'))
                {
                    num = num-2;
                }
                if (ch[i - 1] == 'X' && (ch[i] == 'L' ||  ch[i] == 'C'))
                {
                    num = num-20;
                }
                if (ch[i - 1] == 'C' && (ch[i] == 'D' ||  ch[i] == 'M'))
                {
                    num = num-200;
                }
            }
        }
        return num;
    }
}
