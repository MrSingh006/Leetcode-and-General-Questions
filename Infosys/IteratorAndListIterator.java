package Infosys;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IteratorAndListIterator {
    public static void main(String[] args) {
        List<String> listObject = new ArrayList<String>();
        listObject.add("India");
        listObject.add("Australia");
        listObject.add("England");
        listObject.add("Bangladesh");
        listObject.add("South Africa");
        printIterator(listObject);
        printListIterator(listObject);
    }

    private static void printListIterator(List<String> listObject) {
        ListIterator it = listObject.listIterator();
        System.out.println("Iterating the elements in forward direction: ");
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println("--------------------------------------------");
        System.out.println("Iterating the elements in backward direction: ");
        while (it.hasPrevious()) {
            System.out.println(it.previous());
        }
        System.out.println("--------------------------------------------");
    }

    private static void printIterator(List<String> listObject) {
        Iterator it = listObject.iterator();
        while (it.hasNext())
        {
            System.out.println(it.next());
        }
    }
}
