class Solution {
    static int gcd(int a,int b)
    {
        if(b==0)
        return a;

        return gcd(b,a%b);
    }
    public long gcdSum(int[] nums) {
        int n =nums.length;
        int max=nums[0];
       
        int[] prefixGcd = new int[n];
        for(int i=0;i<n;i++)
        {
            max=Math.max(max,nums[i]);
            prefixGcd[i]=gcd(nums[i],max);
        }

        Arrays.sort(prefixGcd);

        int l=0;
        int r=prefixGcd.length-1;
        long sum=0;
        while(l<r)
        {
            sum+=gcd(prefixGcd[l++],prefixGcd[r--]);
        }
        return sum;

    }
}