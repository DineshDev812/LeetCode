class Solution {
    public String truncateSentence(String s, int k) {
        StringBuilder res=new StringBuilder();
        String[] arr=s.split(" ");
        for(int i=0;i<k;i++)
        {
        res.append(arr[i]);
        if(i<k-1)
        res.append(" ");
        }
        return res.toString();
    }
}