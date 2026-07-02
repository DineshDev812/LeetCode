class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> rowmin= new ArrayList<>();
        List<Integer> colmax= new ArrayList<>();
        int n=matrix.length;
        int m=matrix[0].length;
       
        
        for(int i=0;i<n;i++)
        {
             int min=Integer.MAX_VALUE;
            for(int j=0;j<m;j++)
            {
                if(matrix[i][j]<min)
                min=matrix[i][j];
            }
            rowmin.add(min);
        }

        for(int i=0;i<m;i++)
        {
            int max=Integer.MIN_VALUE;
            for(int j=0;j<n;j++)
            {
                if(matrix[j][i]>max)
                max=matrix[j][i];
            }
            colmax.add(max);
        }
       List<Integer> res=new ArrayList<>();
       for(int i=0;i<rowmin.size();i++)
       {
        if(colmax.contains(rowmin.get(i)))
        res.add(rowmin.get(i));
       }
        return res;


    }
}