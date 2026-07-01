class Solution {
    public int[] numberGame(int[] nums) {
        PriorityQueue<Integer> q = new PriorityQueue<>();
        for(int i=0;i<nums.length;i++)
        q.offer(nums[i]);
        int i=-1;
        while(q.size()>=2)
        {
            int a=q.poll();
            int b=q.poll();
             nums[++i]=b;
            nums[++i]=a;
        }
        return nums;
    }
}