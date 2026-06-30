class Solution {
    public boolean isBalanced(String num) {
        int ei=0,oi=0;
        for(int i=0;i<num.length();i++)
        {
            if(i%2==0)
            ei+=num.charAt(i)-'0';
            else
            oi+=num.charAt(i)-'0';
        }
        System.out.print(ei+" "+oi);
        return ei==oi;

    }
}