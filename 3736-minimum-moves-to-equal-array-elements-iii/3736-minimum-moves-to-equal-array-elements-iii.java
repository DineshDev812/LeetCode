class Solution {
    public int minMoves(int[] nums) {
        int max=Integer.MIN_VALUE;
        for(int i:nums)
        {

            if(i>max)
            max=i;
        }
        int moves=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=max)
            {
                if(nums[i]<max)
                {
                while(nums[i]!=max)
                {
                    nums[i]=nums[i]+1;
                    moves++;
                }
                }
                else
                {
                    while(nums[i]!=max)
                    {
                        nums[i]=nums[i]-1;
                        moves++;
                    }
                }
            }
        }
            return moves;
            
        
    }
}