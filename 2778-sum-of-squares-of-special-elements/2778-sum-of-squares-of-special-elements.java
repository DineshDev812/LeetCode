class Solution {
    public int sumOfSquares(int[] nums) {
        int n=nums.length;
        int sum=0;
        // System.out.println(nums[0]);
        // System.out.print(nums[1]);
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                // System.out.println(nums[i]*nums[i]);
                sum+=Math.pow(nums[i-1],2);
            }
            // System.out.println(sum);
            
        }
        return sum;
    }
}