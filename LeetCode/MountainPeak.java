package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MountainPeak {
    public static void main(String[] args) {
        int[] mountain ={1,4,3,8,5};
        System.out.println(Arrays.toString(new List[]{findPeaks(mountain)}));
    }
    public static List<Integer> findPeaks(int[] mountain) {
        List<Integer> peak = new ArrayList<Integer>();
        for(int i=1;i<mountain.length-1;i++)
        {
            if(mountain[i]>mountain[i-1] && mountain[i]>mountain[i+1])
            {
                peak.add(i);
            }
        }
        System.out.println(peak);
        return peak;
    }
}
