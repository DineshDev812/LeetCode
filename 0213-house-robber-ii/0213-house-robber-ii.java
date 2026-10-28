class Solution {
    public static int f(int[] dp, int[] arr, int n) {
        if (n == 0)
            return arr[n];

        if (n < 0) {
            return 0;
        }

        if (dp[n] != -1)
            return dp[n];

        int pick = arr[n] + f(dp, arr, n - 2);
        int notpick = 0 + f(dp, arr, n - 1);

        return dp[n] = Math.max(pick, notpick);
    }

    public int rob(int[] nums) {
        int n = nums.length;
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        if(n==1)
        return nums[0];
        
        for (int i = 0; i < n; i++) {
            if (i != 0)
                arr1[i] = nums[i];
            if (i != n - 1)
                arr2[i] = nums[i];
        }
        int[] dp = new int[n];

        Arrays.fill(dp, -1);

        f(dp, arr1, n - 1);
        int a = dp[n - 1];

        Arrays.fill(dp, -1);

        f(dp, arr2, n - 1);
        int b = dp[n - 1];

        return Math.max(a, b);
    }
}