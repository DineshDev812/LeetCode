class Solution {
    public boolean isPali(String str,int i,int j)
    {
        while(i<j)
        {
            if(str.charAt(i)!=str.charAt(j))
            return false;
            i++;
            j--;
        }
        return true;
    }
    public int countSubstrings(String s) {
        int c=0;
        for(int i=0;i<s.length();i++)
        {
            for(int j=i;j<s.length();j++)
            {
                
                if(isPali(s,i,j))
                c++;

            }
        }
        return c;
        
    }
}