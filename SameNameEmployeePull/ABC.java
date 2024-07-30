package SameNameEmployeePull;

import java.util.ArrayList;

public class ABC {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList();
        list.add("Sagio Mane");
        list.add("Karius");
        list.add("Mo Salah");
        list.add("Firmino");
        list.add("Lovren");
        list.add("Steven Gerrard");
        list.add("Karius");
        list.add("Mo Salah");

        for(int i =0; i < list.size(); i++) {
            if (list.contains(list.get(i))) {
                System.out.println(list.get(i)+" is duplicated");
            }
        }

    }

}
