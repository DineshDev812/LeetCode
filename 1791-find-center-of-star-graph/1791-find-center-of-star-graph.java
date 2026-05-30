class Solution {
    public int findCenter(int[][] edges) {
        
        int a=edges[0][0];
        int b=edges[0][1];
        int ans =0;
        for(int i=0;i<edges.length;i++)
        {
            
                if(a==edges[i][0]||a==edges[i][1])
                {
                    ans=a;
                }
                else
                {
                    ans=b;
                }
            
        }
        return ans;
        
    }
}