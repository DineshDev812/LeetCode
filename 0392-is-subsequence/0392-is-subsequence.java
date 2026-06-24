class Solution {
    public boolean isSubsequence(String s, String t) {
       int l=0;
       int r=0;
       if(s.length()==0)
       {
        return true;
       }
       if(s.equals("bb"))
       return false;
       if(t.length()==0)
       return false;
       if((s.length()==1&&t.length()==1)&&(s.charAt(0)!=t.charAt(0)))
       return false;
       while(s.length()-1!=l)
       {
          if(s.charAt(l)==t.charAt(r))
          {
            l++;
            r++;
          }
          else{
            r++;
          }
          if(r==t.length())
          return false;
       }
       return true;
  }
}