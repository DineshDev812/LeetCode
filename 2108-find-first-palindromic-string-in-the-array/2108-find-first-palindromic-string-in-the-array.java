class Solution {
    public String firstPalindrome(String[] words) {
        boolean flag=false;
       for(int i=0;i<words.length;i++)
       {
          String s=words[i];
          int l=0;
          int r=s.length()-1;
          if(s.length()==1)
          return s;
          while(l<r)
          {
            if(s.charAt(l)!=s.charAt(r))
            {
                flag=false;
                break;
            }
            else
            {
                r--;
                l++;
                flag=true;
            }
          }
          if(flag)
          return s;
       }
       return "";
    }
}