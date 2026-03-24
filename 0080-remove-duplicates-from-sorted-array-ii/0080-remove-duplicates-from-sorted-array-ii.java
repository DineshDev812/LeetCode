class Solution {
    public int removeDuplicates(int[] nums) {
       Map<Integer,Integer> map = new LinkedHashMap<>();
       for(int n : nums)
       {
        map.put(n,map.getOrDefault(n,0)+1);
       }
      int index = 0;
      for (Map.Entry<Integer,Integer> entry : map.entrySet()) {
           int limit = Math.min(entry.getValue(), 2);
        for (int i = 0; i < limit; i++) {
                  nums[index++] = entry.getKey();
    }
}
return index;

    }
}