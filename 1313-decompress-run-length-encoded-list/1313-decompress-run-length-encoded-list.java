class Solution {
    public int[] decompressRLElist(int[] nums) {
        List<Integer> li = new ArrayList<>();

        for(int i=0;i<nums.length-1;i++)
        {
            if(i%2==0)
            {
                for(int j=0;j<nums[i];j++)
                {
                    li.add(nums[i+1]);
                }
            }
        }
        int[] ans=new int[li.size()];
        int ind=0;
        for(int a:li)
        ans[ind++]=a;
        return ans;
    }
}