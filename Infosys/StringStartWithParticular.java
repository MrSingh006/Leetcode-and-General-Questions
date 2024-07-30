package Infosys;

import java.util.ArrayList;

public class StringStartWithParticular {
    public static void main(String[] args) {
        ArrayList<String> aList =new ArrayList<>();
        aList.add("Paurav");
        aList.add("Anuj");
        aList.add("Akshay");
        aList.add("Sahil");
        aList.add("Sooraj");
        printStringStartWithParticular(aList);
    }

    private static void printStringStartWithParticular(ArrayList<String> aList) {
        aList.stream().filter(s->s.startsWith("A")).forEach(System.out::println);
        aList.stream().filter(s->s.charAt(0)=='A').forEach(System.out::println);
    }
}
