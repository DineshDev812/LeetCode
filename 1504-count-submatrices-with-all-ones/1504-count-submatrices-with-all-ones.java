class Solution {
    public int numSubmat(int[][] mat) {

        int m = mat.length;
        int n = mat[0].length;
        int count = 0;

        int[] height = new int[n];

        for (int i = 0; i < m; i++) {

            // Calculate heights
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == 1)
                    height[j]++;
                else
                    height[j] = 0;
            }

            // Count submatrices ending at this row
            for (int j = 0; j < n; j++) {

                int min = height[j];

                for (int k = j; k >= 0; k--) {

                    min = Math.min(min, height[k]);

                    if (min == 0)
                        break;

                    count += min;
                }
            }
        }

        return count;
    }
}