class Solution {
    public int vowelConsonantScore(String s) {
        String vow="aeiouAEIOU";
        int v=0,c=0;

        for(int i=0;i<s.length();i++)
        {
            if(vow.indexOf(s.charAt(i))!=-1)
            v++;
            else if(Character.isLetter(s.charAt(i)))
            c++;
        }
        if(v!=0&&c!=0)
        return (int)Math.floor(v/c);
        else
        return 0;
    }
}