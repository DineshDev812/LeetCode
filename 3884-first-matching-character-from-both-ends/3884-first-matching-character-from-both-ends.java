class Solution {
    public int firstMatchingIndex(String s) {
        int l=0;
        int r=s.length()-1;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(l)==s.charAt(r))
            {
                return i;
            }
            else
            l++;
            r--;
        }
        return -1;
    }
}