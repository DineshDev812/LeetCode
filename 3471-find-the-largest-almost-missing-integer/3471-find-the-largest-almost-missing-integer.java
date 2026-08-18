class Solution {
    public int largestInteger(int[] nums, int k) {
        int first=nums[0];
        int last=nums[nums.length-1];

        Map<Integer,Integer> map = new HashMap<>();
        int lar=-1;
        for(int i:nums)
        {
            if(i>lar)
            lar=i;
        map.put(i,map.getOrDefault(i,0)+1);
        }
        if(k==nums.length)
        return lar;
        int max=-1;
        int grea=-1;
        for(Map.Entry<Integer,Integer> h:map.entrySet())
        {
            if((h.getKey()==first||h.getKey()==last)&&h.getValue()==1&&h.getKey()>max)
            max=h.getKey();
            if(h.getKey()>grea&&h.getValue()==1)
            grea=h.getKey();
        }
      if(k==1)
      return grea;

        return (max==Integer.MIN_VALUE)?-1:max;
    }
}