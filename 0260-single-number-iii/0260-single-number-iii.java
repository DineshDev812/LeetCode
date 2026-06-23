class Solution {
    public int[] singleNumber(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i:nums)
        {
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int[] arr= new int[2];
        int j=0;
        for(Map.Entry<Integer,Integer> h:map.entrySet())
        {
            if(h.getValue()==1)
            arr[j++]=h.getKey();
        }
        return arr;
    }
}