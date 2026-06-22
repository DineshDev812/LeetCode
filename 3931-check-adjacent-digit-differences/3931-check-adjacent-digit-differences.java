class Solution {
    public boolean isAdjacentDiffAtMostTwo(String s) {
        int res=0;
        char[] ch=s.toCharArray();
        for(int i=0;i<s.length()-1;i++)
        {
            res=Math.abs(Integer.parseInt(String.valueOf(ch[i]))-Integer.parseInt(String.valueOf(ch[i+1])));
            if(res>2)
            return false;
        }
        return true;
    }
}