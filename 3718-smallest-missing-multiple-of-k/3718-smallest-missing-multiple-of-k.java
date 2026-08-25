class Solution {
    public int missingMultiple(int[] nums, int k) {
        Set<Integer> li1 = new HashSet<>();
        for(int i:nums)
        {
            if(i%k==0)
        li1.add(i);
        }

        int num=k;
        while(li1.contains(num))
        num+=k;

        return num;
    }
}