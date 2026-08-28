class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int[] res=new int[nums.length];
        int i=0;
        for(int j:nums)
        {
            if(j<pivot)
            res[i++]=j;
        }
         for(int j:nums)
        {
            if(j==pivot)
            res[i++]=j;
        }
         for(int j:nums)
        {
            if(j>pivot)
            res[i++]=j;
        }
        return res;
    }
}