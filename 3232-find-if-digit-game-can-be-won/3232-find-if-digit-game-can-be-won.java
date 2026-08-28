class Solution {
    public boolean canAliceWin(int[] nums) {
        int sinsum=0,dousum=0;
        for(int i=0;i<nums.length;i++)
        {
            int len=String.valueOf(nums[i]).length();
            if(len==1)
            sinsum+=nums[i];
            else
            dousum+=nums[i];

        }
        return sinsum!=dousum;
    }
}