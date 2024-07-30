package LeetCode;

public class HighestAltitude {
    public static void main(String[] args) {
        int[] gain = {-5, 1, 5, 0, -7};
        largestAltitude(gain);
    }

    public static int largestAltitude(int[] gain) {
        int sum=0;
        int max =0;
        for(int i=0;i<gain.length;i++)
        {
            sum=sum+gain[i];
            if(sum>max)
            {
                max=sum;
            }
            else if(max<=0){
                max=0;
            }
        }
        return max;
    }

}
