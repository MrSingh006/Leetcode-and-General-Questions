package LeetCode;

public class ArrangingCoins {
    public static void main(String[] args) {
        int n =10;
        System.out.println(arrangeCoins(n));
        System.out.println(bruteForce(n));
    }
    public static int bruteForce(int n) {
        int lineCounter = 0;
        int numberCounter = 0;
        int elementInLastLine = 0;
        boolean flag= false;
        for(int i=1;i<=n;i++)
        {
            elementInLastLine = 0;
            for(int j=1;j<=i;j++)
            {
                numberCounter++;
                System.out.print(numberCounter+",");
                elementInLastLine++;
                if(numberCounter>=n)
                {
                    flag=true;
                    break;
                }
            }
            lineCounter++;
            System.out.println("-------"+lineCounter+"-------");
            if(flag)
            {
                break;
            }
        }
        System.out.println("elementInLastLine="+elementInLastLine);
        if(elementInLastLine == lineCounter)
        {
            return lineCounter;
        }
        else {
            return --lineCounter;
        }
    }

    public static int arrangeCoins(int n) {
        int i = 0; // which row we are on
        for(i= 1;i<=n;i++)
        { // checking to see if we have used all our coins
            n = n-i; // adding coins to our row
        }
        return i-1; // we return our current row minus one because the last row is our completed row
    }
}
