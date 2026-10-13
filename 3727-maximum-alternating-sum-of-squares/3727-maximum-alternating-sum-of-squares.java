class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n = nums.length;
        long[] arr = new long[n];

        for (int i = 0; i < n; i++) {
            arr[i] = (long) Math.pow(nums[i], 2);
        }
        Arrays.sort(arr);
        // System.out.print(Arrays.toString(arr));
        long odd = 0;
        long even = 0;
        for (int i = 0; i < n / 2; i++) {
            odd += arr[i];
        }
        for (int i = n / 2; i < n; i++) {
            even += arr[i];
        }
        return even - odd;
    }
}