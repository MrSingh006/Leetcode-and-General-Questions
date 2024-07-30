package LeetCode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class GetDuplicate {
    public static void main(String[] args) {
        ArrayList<String> dupList = new ArrayList<String>();
        dupList.add("naruto");
        dupList.add("Saitama");
        dupList.add("ichigo");
        dupList.add("naruto");
        dupList.add("sasuke");
        dupList.add("boros");
        dupList.add("goku");
        dupList.add("naruto");
        dupList.add("Lucy");
        dupList.add("sasuke");
        dupList.add("natsu");
        dupList.add("Champ");
        dupList.add("Champ");

        System.out.println(getDuplicates(dupList));
//        getDuplicates(dupList);
    }

    private static Set<String> getDuplicates(ArrayList<String> dupList) {
        Set<String> dupSet = new HashSet<>();
        return dupList.stream().filter(n->!dupSet.add(n)).collect(Collectors.toSet());
    }

//    private static void getDuplicates(ArrayList<String> dupList) {
//        Set<String> dupSet = new HashSet<>();
//        dupList.stream().filter(n->!dupSet.add(n)).forEach(System.out::println);
//    }
}
