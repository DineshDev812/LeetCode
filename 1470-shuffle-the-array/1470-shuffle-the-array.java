class Solution {
    public int[] shuffle(int[] nums, int n) {
       int[] res=new int[n<<1];
       for(int i=0,ind=0;i<n;i++)
       {
        res[ind++]=nums[i];
        res[ind++]=nums[i+n];
       }
       return res;
    }
}