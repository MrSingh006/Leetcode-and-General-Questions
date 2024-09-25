package Infosys.round2;

import java.util.ArrayList;
import java.util.Collections;

public class SecondHighestNumberArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(90);
        arr.add(20);
        arr.add(80);
        arr.add(40);
        arr.add(50);
        arr.add(100);
        arr.add(5);
        secondHighestNumberArrayList(arr);
    }

    private static void secondHighestNumberArrayList(ArrayList<Integer> arr) {
        Collections.sort(arr);
        System.out.println(arr);
        arr.sort((i1,i2)-> i1.compareTo(i2));
        System.out.println(arr.get(arr.size()-2));
    }
}
