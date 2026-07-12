class Solution {
    public int longestPalindrome(String s) {
       Map<Character,Integer> map = new HashMap<>();
       for(char ch:s.toCharArray())
       {
        map.put(ch,map.getOrDefault(ch,0)+1);
       }
       boolean odd=false;
       int c=0;
       int b=0;
       for(Map.Entry<Character,Integer> h:map.entrySet())
       {
        if(h.getValue()%2==0)
        {
            c+=h.getValue();
        }
        
        else if(h.getValue()%2!=0)
        {
            c+=h.getValue()-1;
            odd=true;
        }
       }
      return (odd==true)?c+1:c;
        
    }
}