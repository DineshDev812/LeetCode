class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
      int n=nums.length;
      PriorityQueue<int[]> queue= new PriorityQueue<>((a,b)->a[0]==b[0]?a[1]-b[1]:a[0]-b[0]);
      for(int i=0;i<nums.length;i++)
      {
        queue.offer(new int[]{nums[i],i});
      }
    
      while(k>0)
      {
        int[] temp=queue.poll();
        int val=temp[0];
        int ind=temp[1];

        nums[ind]=val*multiplier;
        queue.add(new int[] {nums[ind],ind});
        --k;
      
      }
      return nums;

    }
}