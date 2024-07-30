package LeetCode;

import java.util.Arrays;

public class CountNumberOfTeams {
    public static void main(String[] args)
    {
        int[] rating = {1,2,3,4};
        System.out.println(numTeams(rating));
    }

    public static int numTeams(int[] rating)
    {
        int[] reverseArray = new int[rating.length];
        int count = 0;
        for(int i= 0; i < rating.length ; i++)
        {
            reverseArray[i] = rating[rating.length-1-i];
        }
        System.out.println(Arrays.toString(rating));
        System.out.println(Arrays.toString(reverseArray));

        for(int i=0;i<rating.length-3;i++)
        {
            if(rating[i]<rating[i+1] && rating[i+1]<rating[i+2])
            {
                count++;
            }
        }
        for(int i=rating.length-1;i>=2;i--)
        {
            if(rating[i]<rating[i+1] && rating[i+1]<rating[i+2])
            {
                count++;
            }
        }


        return count;
    }
}

