package LeetCode;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = {64,25,12,22,11};
        System.out.println(Arrays.toString(arr));
        int[] selectionSorted = selectionSort(arr);
        System.out.println(Arrays.toString(selectionSorted));
    }
    public static int[] selectionSort(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            int indx = i;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[j]<arr[indx])
                {
                    indx=j;
                }
            }
            int temp = arr[indx];
            arr[indx] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }
}
