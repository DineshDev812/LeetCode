class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        String res="";
        for(String s:words)
        {
            int sum=0;
            for(char ch:s.toCharArray())
            {
                sum+=weights[ch-'a'];
            }
        
        int val=sum%26;
        res+=(char)('z'-val);
        }
        return res;

    }
}