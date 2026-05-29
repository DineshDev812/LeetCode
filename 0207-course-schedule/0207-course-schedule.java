class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
       List<List<Integer>> li=new ArrayList<>();
       for(int i=0;i<numCourses;i++)
       {
        li.add(new ArrayList<>());
       }
       int indegree[]= new int[numCourses];
       for(int[] a:prerequisites)
       {
        int pre=a[1];
        int cour=a[0];
        li.get(pre).add(cour);
        indegree[cour]++;

       }
       Queue<Integer> q = new LinkedList<>();
       for(int i=0;i<numCourses;i++)
       {
        if(indegree[i]==0)
        {
            q.offer(i);
        }
       }

       int com=0;
       while(!q.isEmpty())
       {
        int temp=q.poll();
        for(int neigh:li.get(temp))
        {
            indegree[neigh]--;
            if(indegree[neigh]==0)
            {
                q.offer(neigh);
            }
        }
        com++;
       }
       return com==numCourses;

    }
}