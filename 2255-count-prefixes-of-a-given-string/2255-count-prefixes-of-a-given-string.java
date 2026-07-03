class Solution {
    public int countPrefixes(String[] words, String s) {
        int c=0;
        for(String str:words)
        {
            if(s.startsWith(str))
            c++;
        }
        return c;
    }
}