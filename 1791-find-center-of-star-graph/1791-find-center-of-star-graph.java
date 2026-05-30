class Solution {
    public int findCenter(int[][] edges) {
        Set<Integer> set = new HashSet<>();
        set.add(edges[0][0]);
        set.add(edges[0][1]);
        int ans =0;
        for(int i=0;i<edges.length;i++)
        {
            for(int j=0;j<edges[0].length;j++)
            {
                if(set.contains(edges[i][j]))
                {
                    ans=edges[i][j];
                }
            }
        }
        return ans;
        
    }
}