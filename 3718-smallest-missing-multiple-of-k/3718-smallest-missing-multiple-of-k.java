class Solution {
    public int missingMultiple(int[] nums, int k) {
        int n=nums.length;
        Set<Integer> li1 = new HashSet<>();
        for(int i:nums)
        li1.add(i);

        int num=k;
        while(li1.contains(num))
        num+=k;

        return num;
    }
}