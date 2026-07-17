class Solution {
    public boolean hasAlternatingBits(int n) {
        String s=Integer.toBinaryString(n);
        for(int i=0;i<s.length()-1;i++)
        {
            if((s.charAt(i)=='1'&&s.charAt(i+1)=='0')||(s.charAt(i)=='0'&&s.charAt(i+1)=='1'))
            continue;
            else
            return false;
        }
        return true;
    }
}