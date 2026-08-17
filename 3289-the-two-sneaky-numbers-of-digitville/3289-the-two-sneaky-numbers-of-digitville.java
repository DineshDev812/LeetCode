class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int[] freq=new int[nums.length];
        for(int i:nums)
        freq[i]++;
        int[] arr = new int[2];
        int j=0;
        for(int i=0;i<nums.length;i++)
        {
            if(freq[i]==2)
            {
               arr[j]=i;
               j++;
            }
        }
       
        return arr;
    }
}