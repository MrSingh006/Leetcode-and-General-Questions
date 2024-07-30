package LeetCode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Panagram {
    public static void main(String[] args) {
        String sentence = "cdscsdcscdsfsdfdsfthhaa";
        System.out.println(checkIfPangram(sentence));
    }

    public static boolean checkIfPangram(String sentence) {
        char[] arr = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l',
                'm', 'n', 'o', 'p', 'q', 'r','s', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        boolean result =true;

        Set<Character> charSet = new HashSet<Character>();

        for(char c: sentence.toCharArray())
        {
            charSet.add(c);
        }
        Set<Character> sortedSet = charSet.stream().sorted().collect(Collectors.toSet());

        System.out.println(sortedSet);
        int j =0;
        char[] sentenceArray = new char[sortedSet.size()];

        for(Character c :sortedSet)
        {
            sentenceArray[j++] = c;
        }

        for(int i =0;i<sentenceArray.length;i++)
        {
            if(sentenceArray[i]!=arr[i])
            {
                result = false;
            }
        }

        return result;
    }
}
