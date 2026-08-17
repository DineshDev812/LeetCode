class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int[] freq=new int[nums.length];
        for(int i:nums)
        freq[i]++;
        ArrayList<Integer> li = new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            if(freq[nums[i]]==2)
            {
                if(!li.contains(nums[i]))
            li.add(nums[i]);
            }
        }
        int[] arr = new int[li.size()];
        int j=0;
        for(int i:li)
        arr[j++]=i;
        return arr;
    }
}