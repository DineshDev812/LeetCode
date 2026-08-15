class Solution {
    public int longestSubsequence(int[] nums) {
        int count=0;
        int len=nums.length;
        boolean nonzero=true;
        for(int i:nums)
        {
           count^=i;
           if(i!=0)
           {
            nonzero=false;
           } 
        }
        if(count!=0)
        return len;
        if(!nonzero)
        return len-1;
        return 0;
       
    }
}