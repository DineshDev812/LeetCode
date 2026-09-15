class Solution {
    public boolean isPali(String s, int i, int j) {
        // System.out.println(s);
        while (i < j) {
            if (s.charAt(i) != s.charAt(j))
                return false;
            else {
                i++;
                j--;
            }
        }
        return true;
    }

    public int maxPalindromes(String s, int k) {
        int n = s.length();
        int count = 0;
        int i = 0;
        while (i + k <= n) {
            if (isPali(s, i, i + k - 1)) {
                count++;
                i = i + k;
            }

            else if (i + k + 1 <= n &&
                    isPali(s, i, i + k)) {
                count++;
                i = i + k + 1;
            }

            else {
                i++;
            }
        }

        return count;
    }
}