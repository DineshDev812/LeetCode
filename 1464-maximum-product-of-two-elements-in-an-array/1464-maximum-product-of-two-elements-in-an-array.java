class Solution {
    public int maxProduct(int[] nums) {
        PriorityQueue<Integer> q = new PriorityQueue<>();
        for(int i:nums)
        {
        q.offer(i);
        if(q.size()>2)
        q.poll();
        }
        int ans=1;
        while(!q.isEmpty())
        {
            ans*=q.poll()-1;
        }
        return ans;
    }
}