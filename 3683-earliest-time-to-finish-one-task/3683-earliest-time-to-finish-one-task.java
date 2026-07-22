class Solution {
    public int earliestTime(int[][] tasks) {
        int min=Integer.MAX_VALUE;
        for(int i=0;i<tasks.length;i++)
        {
            if(min>tasks[i][0]+tasks[i][1])
            {
                min=tasks[i][0]+tasks[i][1];
            }
        }
        return min;
    }
}