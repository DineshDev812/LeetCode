class Solution {
    public int numberOfSpecialChars(String word) {
        Set<Character> set=new LinkedHashSet<>();
        for(char c:word.toCharArray())
        {
            set.add(c);
        }

        int c=0;
       for(char a:set)
       {
        for(char b:set)
        {
            if(Math.abs((int)a-(int)b)==32){
            c++;
            break;
            }
        }
       }
        return c/2;
    }
}