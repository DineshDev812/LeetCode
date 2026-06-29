class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        // int l=0;
        int r=s.length();
        int res=0;
        int max=0;
       for(int i=0;i<r;i++)
       {
        char ch=s.charAt(i);
        
            if(s.lastIndexOf(ch)!=-1&&s.lastIndexOf(ch)!=i)
            {
                res=Math.abs(i-s.lastIndexOf(ch)); 
                if(res>max)
                max=res;   
            }

        
       }
       return max-1;
    }
}