package Infosys.round2.duplicateInSet;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Driver {
    public static void main(String[] args) {
        Set<Employee> set = new HashSet<>();
        set.add(new Employee(101,"Paurav"));
        set.add(new Employee(101,"Paurav"));
        System.out.println("Employee Set : "+set);

        Set<String> stringSet = new HashSet<>();
        stringSet.add("paurav");
        stringSet.add("paurav");

        System.out.println("String Set : "+stringSet);
    }
}
