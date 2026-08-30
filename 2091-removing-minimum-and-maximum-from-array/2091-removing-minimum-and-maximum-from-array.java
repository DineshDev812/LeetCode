class Solution {
    public int minimumDeletions(int[] nums) {
        int minind = 0;
        int maxind = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < nums[minind]) {
                minind = i;
            }
            if (nums[i] > nums[maxind]) {
                maxind = i;
            }
        }
        int n = nums.length;
        int front = Math.max(minind, maxind) + 1;

        int back = n - Math.min(minind, maxind);

        int frontback = Math.min(minind, maxind) + 1
                + n - Math.max(minind, maxind);

        return Math.min(front, Math.min(back, frontback));

    }
}