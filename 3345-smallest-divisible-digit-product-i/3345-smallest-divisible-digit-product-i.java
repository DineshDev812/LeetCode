class Solution {
    public int smallestNumber(int n, int t) {

        for(int i=n;i<=n+10;i++)
        {
            int prod=1;
            int m=i;
            while(m!=0)
            {
                int d=m%10;
                prod*=d;
                m/=10;
            }
           
            if(prod%t==0)
            {
                return i;
            }
        }
        return 0;
    }
}