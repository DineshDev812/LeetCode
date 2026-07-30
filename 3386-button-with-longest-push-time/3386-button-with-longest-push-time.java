class Solution {
    public int buttonWithLongestTime(int[][] events) {
        int max = events[0][1];
        int ans = events[0][0];

        for (int i = 1; i < events.length; i++) {
            int button = events[i][0];
            int previousTime = events[i - 1][1];
            int currentTime = events[i][1];

            int duration = currentTime - previousTime;

            if (duration > max) {
                max = duration;
                ans = button;
            } else if (duration == max) {
                ans = Math.min(ans, button);
            }
        }

        return ans;
    }
}