class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
       int m = nums1.length;
       int n = nums2.length;
       int f = m+n;
       int m1 = (f-1)/2;
       int m2 = (f)/2;
       int count =0;
       int a = 0;
       int b = 0;
       int pre=0,cur = 0;
       while(count<=m2)
       {
        pre = cur;
        if(a < m && (b>=n||nums1[a]<=nums2[b]))
        {
            cur=nums1[a++];

        }
        else
        {
            cur=nums2[b++];
        }
        count++;
       }
       if(f%2==0)
       {
        return (pre+cur)/2.0;
       }
       else
       {
        return cur;
       }
    }
}