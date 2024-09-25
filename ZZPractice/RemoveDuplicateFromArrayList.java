package ZZPractice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateFromArrayList {
    public static void main(String[] args) {
/*        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(40);
        arr.add(30);
        arr.add(50);
        arr.add(60);
        arr.add(40);
        arr.add(90);
        arr.add(50);
        arr.add(10);
        arr.add(30);
        arr.add(20);*/
        ArrayList<String> arr = new ArrayList<>();
        arr.add("Paurav");
        arr.add("Anuj");
        arr.add("Akshay");
        arr.add("Paurav");
        removeDuplicateSet(arr);
    }

    private static void removeDuplicateSet(ArrayList<String> arr)
    {
        Set<String> set = new HashSet<>(arr);
        System.out.println(set);
    }
}
