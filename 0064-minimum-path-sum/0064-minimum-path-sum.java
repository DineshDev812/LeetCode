
class Solution {
    public static int f(int i, int j, int[][] arr, int[][] dp) {
        if (i == 0 && j == 0) {
            return arr[i][j];
        }

        if (i < 0 || j < 0) {
            return Integer.MAX_VALUE;
        }

        if (dp[i][j] != -1) {
            return dp[i][j];
        }

        int up = f(i - 1, j, arr, dp);
        int left = f(i, j - 1, arr, dp);

        int min = Math.min(up, left);

        if (min == Integer.MAX_VALUE) {
            return dp[i][j] = Integer.MAX_VALUE;
        }

        return dp[i][j] = arr[i][j] + min;
    }

    public int minPathSum(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        int[][] dp = new int[n][m];

        for (int i = 0; i < n; i++) {
            Arrays.fill(dp[i], -1);
        }

        return f(n - 1, m - 1, grid, dp);
    }
}
