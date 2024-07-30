package Interview;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class Test {
    public static void main(String[] args) {
        ArrayList<Employee> elist =new ArrayList<Employee>();
        elist.add(new Employee(1,500));
        elist.add(new Employee(2,1000));
        elist.add(new Employee(3,1500));
        elist.add(new Employee(4,2000));
        elist.add(new Employee(5,2500));
        elist.add(new Employee(6,3000));
        elist.add(new Employee(7,3500));
        sortInDescOrder(elist);
//        getThirdHighestSalary(elist);
    }

    private static void sortInDescOrder(ArrayList<Employee> elist) {
        List<Employee> sortedList = new ArrayList<Employee>();
        sortedList=elist.stream().sorted((i1, i2) -> i1.getSalary()>i2.getSalary()?-1:(i2.getSalary()>i1.getSalary())?1:0).collect(Collectors.toList());
        sortedList.stream().forEach(System.out::println);
    }
//    private static void getThirdHighestSalary(ArrayList<Employee> elist) {
//        List<Employee> sortedList = new ArrayList<Employee>();
//        sortedList=elist.stream().sorted((i1, i2) -> i1.getSalary()>i2.getSalary()?-1:(i2.getSalary()>i1.getSalary())?1:0).collect(Collectors.toList());
//        sortedList.stream().filter(i1->i1.getSalary()>i1.get(3)).collect(Collectors.toList());
//        sortedList.get(3);
//        sortedList.stream().forEach(System.out::println);
//    }
}
