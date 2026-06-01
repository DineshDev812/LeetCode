import java.util.*;
class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount+1];

        
            Arrays.fill(dp,amount+1);
        
        dp[0]=0;
        for(int coin:coins)
        {
            for(int j=coin;j<dp.length;j++)
            {
                dp[j]=Math.min(dp[j],dp[j-coin]+1);

            }
        }
        if(dp[amount]>amount)
        {
            return -1;
        }
        else
        return dp[dp.length-1];
    }
}