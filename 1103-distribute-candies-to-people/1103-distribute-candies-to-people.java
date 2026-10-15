class Solution {
    public int[] distributeCandies(int candies, int num_people) {
        int[] arr = new int[num_people];
        int n=arr.length;

        int ans=1;
        int i=0;

        while(candies>0)
        {
            int cur=Math.min(ans,candies);

            arr[i]+=cur;
            candies-=cur;

            ans++;

             i=(i+1)%n;

        }

        return arr;
    }
}