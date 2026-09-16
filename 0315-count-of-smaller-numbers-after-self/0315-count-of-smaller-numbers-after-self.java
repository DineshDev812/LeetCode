class Solution {
    int[] ans;

    public List<Integer> countSmaller(int[] nums) {
        int n = nums.length;
        ans = new int[n];

        int[][] a = new int[n][2];

        for (int i = 0; i < n; i++) {
            a[i][0] = nums[i];
            a[i][1] = i;
        }

        sort(a, 0, n - 1);

        List<Integer> res = new ArrayList<>();

        for (int x : ans)
            res.add(x);

        return res;
    }

    void sort(int[][] a, int l, int r) {
        if (l >= r)
            return;

        int m = (l + r) / 2;

        sort(a, l, m);
        sort(a, m + 1, r);

        int[][] temp = new int[r - l + 1][2];

        int i = l, j = m + 1, k = 0;
        int count = 0;

        while (i <= m && j <= r) {
            if (a[j][0] < a[i][0]) {
                temp[k++] = a[j++];
                count++;
            } else {
                ans[a[i][1]] += count;
                temp[k++] = a[i++];
            }
        }

        while (i <= m) {
            ans[a[i][1]] += count;
            temp[k++] = a[i++];
        }

        while (j <= r)
            temp[k++] = a[j++];

        for (i = 0; i < temp.length; i++)
            a[l + i] = temp[i];
    }
}