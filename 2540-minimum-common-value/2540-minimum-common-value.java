class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        Set<Integer> arr1 = new HashSet<>();
        for(int i=0;i<nums1.length;i++)
        {
           
        arr1.add(nums1[i]);
        }
        for(int i=0;i<nums2.length;i++)
        {
            if(arr1.contains(nums2[i]))
            {
                
                return nums2[i];
            }
        }
        return -1;    
    }
}