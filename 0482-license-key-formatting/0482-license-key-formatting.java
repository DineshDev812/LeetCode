class Solution {
    public String licenseKeyFormatting(String s, int k) {
        String res="";
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)!='-')
            res+=s.charAt(i);
        }
        int t=0;
        int y=res.length();
        StringBuilder sb = new StringBuilder();
        while(y>0)
        {
            if(t==k)
            {
                sb.append("-");
                t=0;
            }
            else
            {
               sb.append(res.charAt(--y));
               t++;
            }
            
        }
        
        return sb.reverse().toString().toUpperCase();
    }
}