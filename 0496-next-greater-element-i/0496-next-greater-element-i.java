class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map = new HashMap<>();
        Stack<Integer> st = new Stack<>();
        for(int n:nums2)
        {
            while(!st.isEmpty()&&n>st.peek())
            {
                map.put(st.pop(),n);
            }
            st.push(n);
        }
        int arr[] = new int[nums1.length];
        int a=0;
        for(int num:nums1)
        {
            arr[a++]=map.getOrDefault(num,-1);
        }
        return arr;
    }
}