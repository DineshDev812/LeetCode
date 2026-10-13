class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            nums[i] *= nums[i];
        }
        Arrays.sort(nums);
        long odd = 0;
        long even = 0;
        for (int i = 0; i < n / 2; i++) {
            odd += nums[i];
        }
        for (int i = n / 2; i < n; i++) {
            even += nums[i];
        }
        return even - odd;
    }
}