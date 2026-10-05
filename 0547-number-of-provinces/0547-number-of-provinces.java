class Solution {
    private static void dfs(int node,ArrayList<ArrayList<Integer>> li,boolean[] vis)
    {
        vis[node]=true;

        for(int i:li.get(node))
        {
            if(!vis[i])
            {
                dfs(i,li,vis);
            }
        }
    }
    public int findCircleNum(int[][] isConnected) {
        ArrayList<ArrayList<Integer>> adj= new ArrayList<>();

        
        int count=0;
        int n=isConnected.length;
        for(int i=0;i<n;i++)
        {
            adj.add(new ArrayList<>());
        }

        for(int i=0;i<isConnected.length;i++)
        {
            for(int j=0;j<isConnected[0].length;j++)
            {
                if(isConnected[i][j]==1 && i!=j)
                {
                    adj.get(i).add(j);
                    adj.get(j).add(i);
                }
            }
        }
        boolean[] vis = new boolean[n+1];
        // vis[0]=true;
        for(int i=0;i<n;i++)
        {
            if(!vis[i])
            {
                count++;
                dfs(i,adj,vis);
            }
        }
        return count;
    }
}