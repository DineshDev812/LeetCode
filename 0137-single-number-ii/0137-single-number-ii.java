class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer,Integer> map = new LinkedHashMap<>();
        for(int n:nums)
        {
            map.put(n,map.getOrDefault(n,0)+1);
        }
        for(Map.Entry<Integer,Integer> m:map.entrySet())
        {
            if(m.getValue()==1)
            {
                return m.getKey();
            }
        }
        return -1;
    }
}