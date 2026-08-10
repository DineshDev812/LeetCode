class Solution {
    public int[] getConcatenation(int[] nums) {
        
        int[] arr = new int[nums.length+nums.length];
        System.arraycopy(nums,0,arr,0,nums.length);
        System.arraycopy(nums,0,arr,nums.length,nums.length);
        return arr;
        
    }
}