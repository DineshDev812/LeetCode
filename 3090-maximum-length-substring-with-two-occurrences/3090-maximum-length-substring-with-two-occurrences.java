class Solution {
    public int maximumLengthSubstring(String s) {
       HashMap<Character,Integer> map = new HashMap<>();

       int left=0;
       int max=Integer.MIN_VALUE;

       for(int i=0;i<s.length();i++)
       {
        map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);

       while(map.get(s.charAt(i))>2)
       {
        map.put(s.charAt(left),map.get(s.charAt(left))-1);
        left++;
       }

       if(i-left+1>max)
       max=i-left+1;

       } 
        
       return max;
   
    }
}