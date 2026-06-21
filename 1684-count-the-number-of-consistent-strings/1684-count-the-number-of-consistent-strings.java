class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
       List<Character> li=new ArrayList<>();
       for(char ch:allowed.toCharArray())
       li.add(ch);
       int c=0;
       for(int i=0;i<words.length;i++)
       {
        String a=words[i];
        boolean flag=true;
         for(int j=0;j<words[i].length();j++)
         {
            if(!li.contains(a.charAt(j)))
            {
            flag= false;
            break;
            }
         }
         if(flag)
         c++;
       }
       return c; 
    }
}