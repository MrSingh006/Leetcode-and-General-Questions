package SameNameEmployeePull;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SameName {
    public static void main(String[] args) {
        ArrayList<String> l = new ArrayList<String>();
        l.add("naruto");
        l.add("Saitama");
        l.add("ichigo");
        l.add("naruto");
        l.add("sasuke");
        l.add("boros");
        l.add("goku");
        l.add("naruto");
        l.add("Lucy");
        l.add("sasuke");
        l.add("natsu");
        l.add("Champ");

        duplicates(l);
        duplicatesUsingSet(l);
        Collections.sort(l);
        System.out.println(l);
    }

    private static void duplicatesUsingSet(ArrayList<String> l) {
//        Set<String> s = l.stream().filter(s.add(l))
    }

    private static void duplicates(ArrayList<String> l) {
        Map<String,Long> map = l.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        map.entrySet().stream().filter(m->m.getValue()>1).forEach(m-> System.out.println(m.getKey()));
    }
}
