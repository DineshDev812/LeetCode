class Solution {
    public boolean isBalanced(String num) {
        int ei=0,oi=0;
        for(int i=0;i<num.length();i++)
        {
            int res=num.charAt(i)-'0';
            if(i%2==0)
            ei+=res;
            else
            oi+=res;
        }
        
        return ei==oi;

    }
}