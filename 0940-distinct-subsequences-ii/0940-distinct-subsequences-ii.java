class Solution {
    public int distinctSubseqII(String s) {
        int MAX = 1000000007;
        long[] end = new long[26];
        long total = 0;
        for (char c : s.toCharArray()) {
            long newEnd = (total + 1) % MAX;
            total = (total + newEnd - end[c - 'a'] + MAX) % MAX;
            end[c - 'a'] = newEnd;
        }
        return (int) total % MAX;
    }
}