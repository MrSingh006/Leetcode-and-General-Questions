package matrices;

public class MaxWealth {
    public static void main(String[] args) {
        int[][] accounts = {{1,5},{7,3},{3,5}};
        int result =maximumWealth(accounts);
        System.out.println(result);
    }
    public static int maximumWealth(int[][] accounts) {
        int i =0;
        int maxAmount =0;
        while(i<accounts.length)
        {
            int amount = 0;
            for(int j=0;j<accounts[i].length;j++)
            {
                amount = amount+accounts[i][j];
            }
            if(amount>=maxAmount)
            {
                maxAmount = amount;
            }
            i++;
        }
        return maxAmount;
    }
}
