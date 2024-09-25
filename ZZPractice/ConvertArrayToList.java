package ZZPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertArrayToList {
    public static void main(String[] args) {
        String[] strs = {"Paurav", "Anuj", "Akshay"};
        arrayToList(strs);
    }

    private static void arrayToList(String[] strs) {
        ArrayList<String> arr = new ArrayList<>(List.of(strs));
        System.out.println(arr);
        List<String> list = Arrays.stream(strs).toList();
        System.out.println(list);
    }
}
