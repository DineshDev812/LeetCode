class Solution {
    public long findTheArrayConcVal(int[] nums) {
        int l=0;int r=nums.length-1;
        long sum=0;
        int n=nums.length;
        while(l<r)
        {
            String a=String.valueOf(nums[l++]);
            String b=String.valueOf(nums[r--]);
            String c=a+b;
            sum+=Long.parseLong(c);
        }
        if(n%2!=0)
        {
            sum+=nums[n/2];
        }
        return sum;
    }
}