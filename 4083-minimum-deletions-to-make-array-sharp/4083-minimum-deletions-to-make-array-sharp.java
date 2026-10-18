class Solution {
    public int minDeletions(int[] nums) {
        int res=nums[0];

        int count=0;
        for(int i=1;i<nums.length;i++)
        {
            
            if((res^nums[i])==0)
            count++;
            else
            res=nums[i];

        }
        return count;
    }
}