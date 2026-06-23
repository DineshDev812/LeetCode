class Solution {
    public int maxPower(String s) {
        if(s.length()==1)
        return 1;
        int max=0;
        int c=1;
        for(int i=0;i<s.length()-1;i++)
        {
            if(s.charAt(i)==s.charAt(i+1))
            {
                c++;
            }
            else
            {
                max=Math.max(max,c);
                c=1;
            }
        }
        max=Math.max(max,c);
        return max;
    }
}