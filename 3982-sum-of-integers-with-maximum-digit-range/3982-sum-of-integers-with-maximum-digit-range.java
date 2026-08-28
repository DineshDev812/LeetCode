class Solution {
    public int maxDigitRange(int[] nums) {
        int maxrange=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<nums.length;i++)
        {
            int max=Integer.MIN_VALUE;
            int min=Integer.MAX_VALUE;
            int num=nums[i];
            int range=0;
            while(num!=0)
            {
                int d=num%10;
                if(d>max)
                max=d;
                if(d<min)
                min=d;
                num/=10;
            }
            range=max-min;
             if(range>maxrange){
                sum=nums[i];
                maxrange=range;
            }
            else if(range==maxrange){
                sum+=nums[i];
            }
            
        }
         
        return sum;

    }
}