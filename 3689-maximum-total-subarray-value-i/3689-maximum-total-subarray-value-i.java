class Solution {
    public long maxTotalValue(int[] nums, int k) {
        long max = Integer.MIN_VALUE;
        long min=Integer.MAX_VALUE;
        for(int a:nums)
        {
            max=Math.max(max,a);
            min=Math.min(min,a);
        }
        return (max-min)*k;
    }
}