class Solution {
    public boolean uniformArray(int[] nums1) {
        if(nums1.length==1)
        return true;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums1.length;i++)
        {
            if(nums1[i]<min)
            min=nums1[i];
        }
        boolean flag=false;
        if(min%2==0)
        {
            for(int i=0;i<nums1.length;i++)
            {
                if(nums1[i]%2!=0)
                {
                    return false;
                }
               
            }
        }
       
       
        return true;
    }
}