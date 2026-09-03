class Solution {
    boolean check(int[] nums, int thresh, int k) {
        int i = 0;
        int count = 0;
        for (int j = 0; j < nums.length; j++) {
            while (nums[j]-nums[i] > thresh) {
                i++;
            }

            count += j - i;

            if (count >= k) {
                return true;
            }
        }

        return false;
    }

    int binarysearch(int[] nums,int k){
        int low=0;int high=nums[nums.length-1]-nums[0];
        int ans=high;
        while(low<=high){
            int mid=(low+high)/2;
            // System.out.println(low+" "+high+" "+mid);
            if(check(nums,mid,k)){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
    public int smallestDistancePair(int[] nums, int k) {
        Arrays.sort(nums);
        return binarysearch(nums,k);
    }
}