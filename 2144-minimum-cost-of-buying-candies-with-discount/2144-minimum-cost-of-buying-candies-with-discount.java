class Solution {
    public int minimumCost(int[] cost) {
        if(cost.length<=1)
        return cost[0];
        Arrays.sort(cost);
        int c=0;
        int sum=0;
        for(int i=cost.length-1;i>=0;i--)
        {
            sum+=cost[i];
            c++;
            if(c==2)
            {
                c=0;
                i--;
            }
        }
        return sum;

    }
}