class Solution {
    public int minElement(int[] nums) {
        int[] arr = new int[nums.length];
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            int sum=0;
            while(nums[i]!=0)
            {
                int d=nums[i]%10;
                sum+=d;
                nums[i]/=10;
            }
            arr[i]=sum;
            if(sum<min)
            {
                min=sum;
            }
        }
       
       
        return min;
    }
}