package LeetCode;

public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = {2,3,4,10,40};
        int x = 10;
        binarySearchAlgo(arr,x);
        System.out.println(10/3);
    }

    private static int binarySearchAlgo(int[] arr, int x) {
        int length = arr.length -1;
        int start = 0;
        while(start<=length)
        {
            int newIndex = start = (length-start)/2;
            if(x>arr[newIndex])
            {
                start = newIndex+1;
            }
            else if(x<arr[newIndex])
            {
                length=newIndex-1;
            }
            else if(x==arr[newIndex])
            {
                return x;
            }
        }
        return -1;
    }
}
