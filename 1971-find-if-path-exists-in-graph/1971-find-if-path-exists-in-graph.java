class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        ArrayList<ArrayList<Integer>> adj= new ArrayList<>();
        for(int i=0;i<n;i++)
        adj.add(new ArrayList<>());
       for(int[] arr:edges)
       {
        int u=arr[0];
        int v=arr[1];
        adj.get(u).add(v);
        adj.get(v).add(u);
       }

       boolean[] vis=new boolean[n+1];
       vis[source]=true;

       Queue<Integer> q = new LinkedList<>();
       q.offer(source);
    //    boolean flag=false;
       while(!q.isEmpty())
       {
         int temp=q.poll();
        if(temp==destination)
        return true;
         for(Integer i:adj.get(temp))
         {
           
            if(!vis[i])
            {
                q.offer(i);
                vis[i]=true;
            }
         }
       }
       return false;
    }
}