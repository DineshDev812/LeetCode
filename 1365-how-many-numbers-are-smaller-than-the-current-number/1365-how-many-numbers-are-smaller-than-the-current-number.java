class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        // Arrays.sort(nums);//1 2 2 3 8
        int[] res=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            int count=0;
            for(int j=0;j<nums.length;j++)
            {
                if(nums[i]>nums[j])
                count++;
            }
            res[i]=count;
        }
        return res;
    }
}