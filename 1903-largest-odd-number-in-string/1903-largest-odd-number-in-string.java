class Solution {
    public String largestOddNumber(String num) {
        int ind=-1;
        char[] ch=num.toCharArray();
        for(int i=ch.length-1;i>=0;i--)
        {
            if((ch[i]-'0')%2!=0)
            {
                ind=i;
                break;
            }
        }
        return num.substring(0,ind+1);
    }
}