class Solution {
    public int numberOfSpecialChars(String word) {
        Set<Character> set=new LinkedHashSet<>();
        for(int i=0;i<word.length();i++)
        {
            set.add(word.charAt(i));
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