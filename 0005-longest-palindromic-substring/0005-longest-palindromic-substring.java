class Solution {
    public String longestPalindrome(String s) {
        
        StringBuilder s2=new StringBuilder();
        for(char ch:s.toCharArray())
        {
            s2.append("#").append(ch);
        }
        s2.append("#");
        String s1=s2.toString();
        int maxlen=0;
        int center=0;
        int [] arr = new int[s1.length()];
        for(int i=0;i<s1.length();i++)
        {
            int left=i-1;
            int right=i+1;
            while((left>=0&&right<s1.length())&&s1.charAt(left)==s1.charAt(right))
            {
                arr[i]++;
                
                left--;
                right++;
            }
            if(arr[i]>maxlen)
            {
                maxlen=arr[i];
                center=i;
            }

        }
        int start=(center-maxlen)/2;
        int end =start+maxlen;
        return s.substring(start,end);
    }
}