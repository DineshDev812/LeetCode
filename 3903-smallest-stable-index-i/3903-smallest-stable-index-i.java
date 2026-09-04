class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n =nums.length;
        if(nums.length==1)
        return 0;
        int ind=-1;
        int minans=Integer.MAX_VALUE;
        for(int i=0;i<n;i++)
        {
            int max=Integer.MIN_VALUE;
            int min=Integer.MAX_VALUE;
            for(int j=0;j<=i;j++)
            {
                if(nums[j]>max)
                max=nums[j];
            }
            for(int j=i;j<n;j++)
            {
                if(nums[j]<min)
                min=nums[j];
            }
            if((max-min)<minans)
            {
                minans=max-min;
                if(minans<=k)
                {
                ind =i;
                break;
                }
            }
        System.out.println("instability score: "+minans);
        System.out.println(max+" "+min);
        // System.out.println(min);
        }
        return ind;
    }
}