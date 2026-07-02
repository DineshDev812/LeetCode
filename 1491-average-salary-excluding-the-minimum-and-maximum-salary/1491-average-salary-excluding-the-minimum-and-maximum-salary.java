class Solution {
    public double average(int[] salary) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int n=salary.length;
        int sum=0;
        for(int i=0;i<n;i++)
        {
            if(salary[i]>max)
            max=salary[i];
            if(salary[i]<min)
            min=salary[i];
            sum+=salary[i];
        }

        int res=sum-(max+min);
        
        return (double)(res)/(n-2);

    }
}