class Solution {
    public int heightChecker(int[] heights) {
        int n=heights.length;
        int[] arr = Arrays.copyOf(heights,heights.length);
        boolean flag=true;
        while(flag)
        {
            flag=false;
            for(int i=0;i<n-1;i++)
            {
                if(heights[i]>heights[i+1])
                {
                    int temp=heights[i];
                    heights[i]=heights[i+1];
                    heights[i+1]=temp;
                    flag=true;
                }
            }
        }
        System.out.println(Arrays.toString(heights));
        int c=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]!=heights[i])
            c++;
        }
        return c;
    }
}