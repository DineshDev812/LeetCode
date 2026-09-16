class Solution {
    public int orangesRotting(int[][] grid) {

        if (grid == null || grid.length == 0)
            return -1;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {

                if (grid[i][j] == 2) {
                    rot(grid, i, j, 2);
                }
            }
        }

        int ans = 2;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {

                if (grid[i][j] == 1)
                    return -1;

                ans = Math.max(ans, grid[i][j]);
            }
        }

        return ans - 2;
    }

    public void rot(int[][] grid, int i, int j, int time) {

        if (i < 0 || i >= grid.length ||
            j < 0 || j >= grid[0].length ||
            grid[i][j] == 0 ||
            (grid[i][j] > 1 && grid[i][j] < time)) {
            return;
        }

        grid[i][j] = time;

        rot(grid, i - 1, j, time + 1);
        rot(grid, i + 1, j, time + 1);
        rot(grid, i, j - 1, time + 1);
        rot(grid, i, j + 1, time + 1);
    }
}