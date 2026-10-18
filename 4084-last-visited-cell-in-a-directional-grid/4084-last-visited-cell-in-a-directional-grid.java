class Solution {
    public int[] lastVisitedCell(char[][] grid) {
        int[] res = new int[2];
        int n = grid.length;
        int m = grid[0].length;

        boolean[][] vis = new boolean[n][m];
        int i = 0, j = 0;
        vis[i][j] = true;

        while (true) {
            int ni = i, nj = j;
            switch (grid[i][j]) {
                case 'R':
                    nj++;
                    break;
                case 'L':
                    nj--;
                    break;
                case 'U':
                    ni--;
                    break;
                case 'D':
                    ni++;
                    break;
            }
            if (ni < 0 || ni >= n || nj < 0 || nj >= m)
                break;
            if (vis[ni][nj])
                break;
            i = ni;
            j = nj;
            vis[i][j] = true;
        }
        return new int[] { i, j };
    }
}