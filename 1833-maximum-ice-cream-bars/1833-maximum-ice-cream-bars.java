class Solution {
    public int maxIceCream(int[] costs, int coins) {
        int count=0;
        int sum=0;
        Arrays.sort(costs);
        
        for(int i=0;i<costs.length;i++)
        {
            sum+=costs[i];
            if(costs[i]<=coins&&sum<=coins)
            {
                count++;
            }
            else
            return count;
           
        }
        return count;
    }
}