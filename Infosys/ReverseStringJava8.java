package Infosys;

import java.util.stream.Stream;

public class ReverseStringJava8 {
    public static void main(String[] args) {
        String str = "Naruto";
        reverseStringJava8(str);
    }

    private static void reverseStringJava8(String str) {
        Stream.of(str).map(sb->new StringBuilder(str).reverse()).forEach(System.out::println);
    }
}
