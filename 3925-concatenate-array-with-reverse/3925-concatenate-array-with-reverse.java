class Solution {
    public int[] concatWithReverse(int[] nums) {
        int n=nums.length;
        int[] arr = new int[n<<1];
        int[] newarr=new int[n];
        int j=0;
        for(int i=n-1;i>=0;i--)
        newarr[i]=nums[j++];
        System.arraycopy(nums,0,arr,0,n);
         System.arraycopy(newarr,0,arr,n,n);
        return arr;
    }
}