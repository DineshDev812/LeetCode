class Solution {
    public int missingMultiple(int[] nums, int k) {
        int n=nums.length;
        List<Integer> li1 = new ArrayList<>();
        // List<Integer> li2 = new ArrayList<>();
        for(int i:nums)
        li1.add(i);

        int num=k;
        while(li1.contains(num))
        num+=k;

        return num;
    }
}