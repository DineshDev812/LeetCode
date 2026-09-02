class Solution {
    public String[] divideString(String s, int k, char fill) {
        int size = (s.length() + k - 1) / k;
        String[] arr = new String[size];

        int j = 0;
        int ind = 0;
        int count = 0;
        int c = 0;
        String res = "";

        while (ind < size) {
            if (j < s.length()) {
                if (count < k) {
                    res += s.charAt(j++);
                    count++;
                } else {
                    arr[ind++] = res;
                    res = "";
                    count = 0;
                }
            } else {
                while (count < k) {
                    res += fill;
                    count++;
                }
                arr[ind++] = res;
            }
        }

        return arr;
    }
}