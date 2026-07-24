class Solution {
    public int percentageLetter(String s, char letter) {
        int c=0;
        int n =s.length();
        for(char ch:s.toCharArray())
        {
            if(ch==letter)
            c++;
        }

    //    if(c!=0)
       int res= Math.round(c*100/n);
       return res;
    //    else
    //    return 0;
    }
}