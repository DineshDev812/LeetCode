class Solution {
    public int findCenter(int[][] edges) {
        
        int a=edges[0][0];
        int b=edges[0][1];
        int ans =0;
        for(int i=0;i<edges.length;i++)
        {
            for(int j=0;j<edges[0].length;j++)
            {
                if(a==edges[i][j]||b==edges[i][j])
                {
                    ans=edges[i][j];
                }
            }
        }
        return ans;
        
    }
}