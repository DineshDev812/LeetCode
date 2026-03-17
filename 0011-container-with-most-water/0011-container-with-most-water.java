class Solution {
    public int maxArea(int[] arr) {
        int n = arr.length;
        int i=0;
        int j = n-1;
        int max = 0;
        while(i<j)
        {
            if(arr[i]<arr[j])
            {
                max = Math.max((j-i)*arr[i],max);
                i++;
            }
            else
            {
                max = Math.max((j-i)*arr[j],max);
                j--;
            }

        }
        return max;
     }
}