package Infosys;

import java.util.Arrays;

public class ReverseStringInfi {
    public static void main(String[] args) {
        String s = "Naruto";
        reverseString(s);
        reverseString1(s);
    }

    private static void reverseString(String s) {
        char[] arr = s.toCharArray();
        System.out.println(Arrays.toString(arr));
        StringBuilder sb = new StringBuilder();
        for(int i=arr.length-1;i>=0;i--)
        {
            sb.append(arr[i]);
        }
        System.out.println(sb);
    }

    // Alternate Method

    private static void reverseString1(String s) {
        String str= "Geeks";
        String nstr="";
        char ch;

        System.out.print("Original word: ");
        System.out.println("Geeks"); //Example word

        for (int i=0; i<str.length(); i++)
        {
            ch= str.charAt(i); //extracts each character
            nstr= ch+nstr; //adds each character in front of the existing string
        }
        System.out.println("Reversed word: "+ nstr);
    }

}
