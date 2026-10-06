class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        Queue<Integer> q = new LinkedList<>();
        int n=rooms.size();
        boolean[] vis= new boolean[n];
        vis[0]=true;
        q.offer(0);
        while(!q.isEmpty())
        {
            int temp=q.poll();
            for(Integer i:rooms.get(temp))
            {
                if(!vis[i])
                {
                    vis[i]=true;
                    q.offer(i);
                }
            }
        }
        // System.out.println(Arrays.toString(vis));
       for(int i=0;i<vis.length;i++)
       {
        if(vis[i]!=true)
        return false;
       }
       return true;
    }
}