class Solution {
    public int[] maxDepthAfterSplit(String seq) {
        int count=0;
        int[] res= new int[seq.length()];

        for(int i=0;i<seq.length();i++)
        {
            if(seq.charAt(i)=='(')
            {
                count++;
                res[i]=count%2;
            }
            else
            {
                res[i]=count%2;
                count--;
            }
        }
        return res;
    }
}