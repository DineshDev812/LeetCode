class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] num= new int[nums.length];
        int[] arr = new int[num.length+nums.length];
        for(int i=0;i<nums.length;i++)
        {
            num[i]=nums[i];
        }
        for(int i=0;i<num.length;i++)
        {
            arr[i]=num[i];
        }
        for(int j=0;j<nums.length;j++)
        {
            arr[j+num.length]=nums[j];
        }
        return arr;
        
    }
}