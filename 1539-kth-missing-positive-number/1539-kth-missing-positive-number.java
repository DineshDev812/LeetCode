class Solution {
    public int findKthPositive(int[] arr, int k) {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        if(arr[i]>max)
        max=arr[i];

        Set<Integer> set=new HashSet<>();
        for(int i=0;i<arr.length;i++)
        {
            set.add(arr[i]);
        }
        int c=0;
        int ans=0;
        for(int i=0;i<=max+k;i++)
        {
            if(!set.contains(i)&&c==k)
            {
                ans= i;
                break;
            }
            else if(!set.contains(i))
            c++;
        }
        if(ans==0)
        {
           return max+k;
        }
        return ans;
    }
}