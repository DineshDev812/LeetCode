class Solution {
    public String minWindow(String s, String t) {
       int[] freq=new int[128];
       for(char ch:t.toCharArray())
       freq[ch]++;

       int count=t.length();
       int left=0;
       int minlen=Integer.MAX_VALUE;
       int start=0;
       for(int r=0;r<s.length();r++)
       {
        if(freq[s.charAt(r)]>0)
        count--;
        
        freq[s.charAt(r)]--;

        while(count==0)
        {
            if(r-left+1<minlen)
            {
                minlen=r-left+1;
                start=left;
            }

            freq[s.charAt(left)]++;

            if(freq[s.charAt(left)]>0)
            count++;

            left++;
        }
       }

       if(minlen==Integer.MAX_VALUE)
       return "";
       else
       return s.substring(start,start+minlen);
    }
}
