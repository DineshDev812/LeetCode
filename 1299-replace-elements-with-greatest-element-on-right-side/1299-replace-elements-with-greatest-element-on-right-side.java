class Solution {
    public int[] replaceElements(int[] arr) {
        Stack<Integer> st = new Stack<>();
        int max=Integer.MIN_VALUE;
        st.push(-1);
        for(int i=arr.length-1;i>0;i--)
        {
            if(arr[i]>max)
            {
                max=arr[i];
                st.push(max);
            }
            else
            {
                st.push(max);
            }
        }
        int [] ar= new int[arr.length];
        int j=0;
        while(!st.isEmpty())
        {
            ar[j++]=st.pop();
        }
        return ar;
    }
}