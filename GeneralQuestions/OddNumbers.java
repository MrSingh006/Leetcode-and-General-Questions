package GeneralQuestions;

import java.util.ArrayList;

public class OddNumbers {
    public static void main(String[] args) {
        ArrayList<Integer> list =new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(40);
        list.add(7);
        list.add(29);
        list.add(8);
        list.add(71);
        list.add(34);
        findOddNumbers(list);
    }
    private static void findOddNumbers(ArrayList<Integer> list) {
        list.stream().filter(x->x%2!=0).forEach(System.out::println);
    }
}
