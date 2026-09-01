class Solution {
    public int[] sumZero(int n) {
        int num=-(n/2);
        int[] arr = new int[n];
        if(n%2!=0)
        {
        for(int i=0;i<n;i++ )
        {
            arr[i]=num++;
        }
        }
        else
        {
        for(int i=0;i<n;i++ )
        {
             if(num==0)
             {
                num+=1;
             }
             
            arr[i]=num++;
        }
        }
        return arr;
    }
}