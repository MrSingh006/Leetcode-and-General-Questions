package LeetCode;

import java.util.Arrays;

public class StringHalvesAreAlike {
    public static void main(String[] args) {
        String s = "textbook";
        System.out.println(halvesAreAlike(s));
    }
    public static boolean halvesAreAlike(String s) {
        char[] character = s.toCharArray();
        char[] a = new char[character.length/2];
        char[] b = new char[character.length/2];
        int count1 = 0;
        int count2 = 0;
        char lowerA;
        char lowerB;
        for(int i =0;i<character.length/2;i++)
        {
            a[i] = character[i];
            b[i] = character[character.length/2+i];
            lowerA = Character.toLowerCase(a[i]);
            lowerB = Character.toLowerCase(b[i]);
            if(lowerA == 'a' || lowerA == 'e' || lowerA == 'i' || lowerA == 'o' || lowerA == 'u'){
                count1++;}
            if(lowerB == 'a' || lowerB == 'e' || lowerB == 'i' || lowerB == 'o' || lowerB == 'u'){
                count2++;}
        }
        if(count1==count2)
        {
            return true;
        }
        else {
            return false;
        }
    }
}
