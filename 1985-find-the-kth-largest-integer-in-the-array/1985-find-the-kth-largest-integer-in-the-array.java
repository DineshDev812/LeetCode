import java.math.BigInteger;
class Solution {
    public String kthLargestNumber(String[] nums, int k) {
        BigInteger[] arr = new BigInteger[nums.length];
        for(int i=0;i<nums.length;i++)
        arr[i]=new BigInteger(nums[i]);

        PriorityQueue<BigInteger> q = new PriorityQueue<>();
        for(BigInteger i:arr)
        {
            q.offer(i);
            if(q.size()>k)
            {
                q.poll();
            }
        }
        return String.valueOf(q.peek());

    }
}