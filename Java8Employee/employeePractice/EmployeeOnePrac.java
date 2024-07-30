package Java8Employee.employeePractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.IntPredicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeOnePrac {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(55);
        list.add(14);
        list.add(68);
        list.add(9);
        list.add(5);
        list.add(66);

//       filterExample(list);
//		 mapExample(list);
//       countMethod(list);
//		 sortedMethod(list);
//       minMethod(list);
//       maxMethod(list);
//		 forEachMethod(list);
//        toArrayMethod(list);
        streamOfMethod();
    }

    private static void streamOfMethod() {
        Stream<Integer> s = Stream.of(3, 4, 2, 6, 43, 2, 52, 22);
        s.forEach(System.out::println);
    }

    private static void toArrayMethod(ArrayList<Integer> list) {
        Integer[] arr =list.stream().toArray(Integer[]::new);
        System.out.println(Arrays.toString(arr));
    }

    private static void forEachMethod(ArrayList<Integer> list) {
        list.stream().forEach(System.out::println);
    }

    private static void maxMethod(ArrayList<Integer> list) {
        Integer max = list.stream().max((i1,i2)->i1.compareTo(i2)).get();
        System.out.println(max);
    }

    private static void minMethod(ArrayList<Integer> list) {
        Integer min = list.stream().min((i1,i2)->i1.compareTo(i2)).get();
        System.out.println(min);
        Integer min1 = list.stream().min((i1,i2)->-i1.compareTo(i2)).get();
        System.out.println(min1);
    }

    private static void sortedMethod(ArrayList<Integer> list) {
        list.stream().sorted().forEach(System.out::println);
        list.stream().sorted((i1,i2)->i1>i2?-1:(i2>i1)?1:0).forEach(System.out::println);
        list.stream().sorted((i1,i2)->-i1.compareTo(i2)).forEach(System.out::println);
    }

    private static void countMethod(ArrayList<Integer> list) {
        Long count = list.stream().filter(i->i>20).count();
        System.out.println(count);
    }

    private static void mapExample(ArrayList<Integer> list) {
        Function<Integer,Integer> f = i->i*2;
        list.stream().map(f::apply).forEach(System.out::println);
        list.stream().map(i->i*2).forEach(System.out::println);
    }

    private static void filterExample(ArrayList<Integer> list) {
        IntPredicate p = i->i%2==0;
        list.stream().filter(p::test).forEach(System.out::println);
        list.stream().filter(i->i%2==0).forEach(System.out::println);
    }
}
