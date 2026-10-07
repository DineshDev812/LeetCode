class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int count = 0;

        for (int i = low; i <= high; i++) {

            int len = String.valueOf(i).length();

            if (len % 2 != 0)
                continue;

            int n = len / 2;

            int sum1 = 0;
            int sum2 = 0;
            int c = 0;
            int num = i;

            while (num != 0) {
                int d = num % 10;

                if (c < n)
                    sum1 += d;
                else
                    sum2 += d;

                num /= 10;
                c++;
            }

            if (sum1 == sum2)
                count++;
        }

        return count;
    }
}