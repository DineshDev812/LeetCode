class Solution {
    public int missingMultiple(int[] nums, int k) {
        int n=nums.length;
        List<Integer> li1 = new ArrayList<>();
        // List<Integer> li2 = new ArrayList<>();
        for(int i:nums)
        li1.add(i);

        for(int i=k;i<=1000;i+=k)
        {
            System.out.println(i);
            if(!li1.contains(i))
            return i;
        }
        return -1;
    }
}