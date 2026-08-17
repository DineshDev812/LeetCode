class Solution {
    public int mirrorDistance(int n) {
        int rev=0;
        int num=n;
        while(n!=0)
        {
            int d=n%10;
            rev=rev*10+d;
            n/=10;
        }
        System.out.println(rev);
        System.out.println(num);
        return Math.abs(num-rev);
    }
}