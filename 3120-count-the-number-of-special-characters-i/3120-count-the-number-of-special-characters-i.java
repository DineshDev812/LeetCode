class Solution {
    public int numberOfSpecialChars(String word) {
        Set<Character> set=new LinkedHashSet<>();
        for(char c:word.toCharArray())
        {
            set.add(c);
        }
        char[] t=new char[set.size()];
        int o=0;
        for(char f:set)
        t[o++]=f;
        //  Arrays.sort(t);


        int c=0;
       for(int i=0;i<t.length;i++)
       {
        for(int j=i+1;j<t.length;j++)
        {
            if(Math.abs((int)t[i]-(int)t[j])==32)
            {
            c++;
            break;
            }
        }
       }
    // System.out.println(t);
        return c;
    }
}