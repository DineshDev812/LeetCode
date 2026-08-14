class Solution {
    public int countDigits(int num) {
        int c=0;
        int a=num;

        while(num!=0)
        {
            int d=num%10;
            if(a%d==0)
            c++;
            num/=10;
        }
        return c;
    }
}