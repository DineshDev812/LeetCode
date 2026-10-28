class Solution {
    static int mod=100000007;
    public static int f(int[][] dp,int[][] arr, int i, int j)
    {
        if(i>=0 && j>=0 && arr[i][j] ==1)
        return 0;
        if(i==0 && j==0)
        return 1;
        if(i<0 || j<0)
        return 0;
        if(dp[i][j]!=-1)
        return dp[i][j];


        int up=f(dp,arr,i-1,j);
        int left=f(dp,arr,i,j-1);

        return dp[i][j] = up+left;
    }
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int n=obstacleGrid.length;
        int m=obstacleGrid[0].length;

        int[][] dp= new int[n][m];
        
        for(int i=0;i<n;i++)
        {
            Arrays.fill(dp[i],-1);
        }

        return f(dp,obstacleGrid,n-1,m-1);
    }
}