class Solution {
    public int climbStairs(int n) {
        if(n<=1)
        return n;

        int prev2=1,prev1=2;

        int cur=0;

        for(int i=2;i<n;i++)
        {
            cur=prev1+prev2;
            prev2=prev1;
            prev1=cur;
           
        }

        return prev1;
    }
}