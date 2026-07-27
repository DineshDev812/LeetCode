class Solution {
    public int maxProduct(int[] nums) {
        // PriorityQueue<Integer> q = new PriorityQueue<>();
        // for(int i:nums)
        // {
        // q.offer(i);
        // if(q.size()>2)
        // q.poll();
        // }
        // int ans=1;
        // while(!q.isEmpty())
        // {
        //     ans*=q.poll()-1;
        // }
        // return ans;
        int max =Integer.MIN_VALUE;
        int secmax=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>max)
            {
                secmax=max;
                max=nums[i];
            }
            else if(nums[i]>secmax)
            {
                secmax=nums[i];
            }
        }
        return (max-1)*(secmax-1);
    }
}