class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int a:nums2)
        {
            map.put(a,map.getOrDefault(a,0)+1);
        }
        List<Integer> li = new ArrayList<>();
        for(int i=0;i<nums1.length;i++)
        {
            if(map.containsKey(nums1[i])&&map.get(nums1[i])>0)
            {
            li.add(nums1[i]);
            map.put(nums1[i],map.get(nums1[i])-1);
            }
            
        }
        int[] arr = new int[li.size()];
        int j=0;
        for(int u:li)
        arr[j++]=u;
        return arr;
    }
}