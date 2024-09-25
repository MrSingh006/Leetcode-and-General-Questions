package Infosys.round2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SecondHighestNumber {
    public static void main(String[] args) {
        int[] arr = {90,20,80,40,50,100,5};
        secondHighest(arr);
        secondHighestBySorting(arr);
    }

    private static void secondHighestBySorting(int[] arr) {
        Arrays.sort(arr);
        System.out.println("By Sorting : "+arr[arr.length-2]);
    }

    private static void secondHighest(int[] arr) {
        int highest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;
        for(int i = 0; i<arr.length; i++)
        {
            if(arr[i]>highest)
            {
                highest = arr[i];
            }
        }
        for(int i = 0; i<arr.length; i++)
        {
            if(arr[i]>secondHighest && arr[i]<highest)
            {
                secondHighest = arr[i];
            }
        }
        System.out.println("Highest : "+highest);
        System.out.println("Second highest : "+secondHighest);
    }
}
