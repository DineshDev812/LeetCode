class Solution {
    public static int calc(int[] dp, int[] arr, int ind)
    {
        if(ind==0)
        return arr[ind];
        if(ind<0)
        return 0;
        if(dp[ind]!=-1)
        return dp[ind];

        int pick=arr[ind]+calc(dp,arr,ind-2);
        int unpick=0+calc(dp,arr,ind-1);

        return dp[ind]=Math.max(pick,unpick);
    }
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==1)
        return nums[0];
        int[] dp = new int[n];
        Arrays.fill(dp,-1);
         calc(dp,nums,n-1);
         return dp[n-1];
    }
}