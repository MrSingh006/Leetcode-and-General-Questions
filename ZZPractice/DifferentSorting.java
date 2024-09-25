package ZZPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class DifferentSorting {
    public static void main(String[] args) {
        int[] intArr = {50,40,10,30,90};

        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(50);
        intList.add(40);
        intList.add(10);
        intList.add(30);
        intList.add(90);

        String[] str = {"paurav", "anuj", "Akshay", "vardhan"};

        ArrayList<String> strList = new ArrayList<>();
        strList.add("paurav");
        strList.add("anuj");
        strList.add("Akshay");
        strList.add("vardhan");
        convertAll(intArr,intList,str,strList);
    }

    private static void convertAll(int[] intArr, ArrayList<Integer> intList, String[] str, ArrayList<String> strList)
    {
        Arrays.sort(intArr);
        System.out.println("intArr"+Arrays.toString(intArr));

        Collections.sort(intList);
        System.out.println("intList by collection sort"+intList);
        intList.sort((i1,i2)->i1.compareTo(i2));
        System.out.println("intList by .sort"+intList);

        Arrays.sort(str);
        System.out.println("str"+Arrays.toString(str));

        Collections.sort(strList);
        System.out.println("strList by collection sort"+strList);
        strList.sort((i1,i2)->i1.compareTo(i2));
        System.out.println("strList by .sort"+strList);
    }
}
