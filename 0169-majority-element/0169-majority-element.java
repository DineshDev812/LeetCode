class Solution {
    public int majorityElement(int[] nums) {
        int count=0;
        int candidate=0;
        for(int i=0;i<nums.length;i++)
        {
            if(count==0)
            {
                candidate=nums[i];
            }
            if(nums[i]==candidate)
            {
                count++;
            }
            else
            count--;
        }
        int freq=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==candidate)
            freq++;
        }
        if(freq>nums.length/2)
        return candidate;
        else
        return -1;

    }
}