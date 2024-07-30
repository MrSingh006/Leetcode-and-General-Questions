package LeetCode;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseString {
    public static void main(String[] args) {
        // noob method of doing
        String s = "Simplilearn";
        char[] c = s.toCharArray();
        System.out.println(c);
        String ans = Stream.of(c).map(str->new StringBuffer(Arrays.toString(str)).reverse()).collect(Collectors.joining());
        System.out.println(ans);

        // pro method of doing
        String sp = "ProMethod";
        String proStr = Stream.of(sp).map(pro->new StringBuilder(pro).reverse())
                .collect(Collectors.joining());
        System.out.println(proStr);
    }
}
