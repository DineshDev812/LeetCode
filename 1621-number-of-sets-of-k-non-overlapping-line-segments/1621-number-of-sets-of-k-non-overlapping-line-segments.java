class Solution {
    static long MOD = 1000000007;

    public int numberOfSets(int n, int k) {
        int N = n + k - 1;
        int r = 2 * k;

        long ans = 1;

        for (int i = 1; i <= r; i++) {
            ans = ans * (N - i + 1) % MOD;
            ans = ans * power(i, MOD - 2) % MOD;
        }

        return (int) ans;
    }

    public long power(long a, long b) {
        long ans = 1;

        while (b > 0) {
            if (b % 2 == 1)
                ans = ans * a % MOD;

            a = a * a % MOD;
            b /= 2;
        }

        return ans;
    }
}