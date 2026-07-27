class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int res =0;
        int max =Integer.MIN_VALUE;
        for(int i=0;i<nums.length-2;i++)
        {
                
        int m = nums[i]*nums[i+1]*nums[nums.length-1];

           if(max<m)
           {
            max = m;
           }
            
        }
        return max;
    }
}