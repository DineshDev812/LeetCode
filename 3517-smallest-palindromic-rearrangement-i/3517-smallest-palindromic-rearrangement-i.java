class Solution {
    public String smallestPalindrome(String s) {
        if(s.length()<=3)
        {
            return s;
        }
        int n =s.length()/2;
        String ans="";
        String s1="";
        System.out.print(n);

        if(s.length()%2==0)
        {
            s1=s.substring(0,n);
        
        char[] ch=s1.toCharArray();
        Arrays.sort(ch);
        String res=new String(ch);
        StringBuilder sb = new StringBuilder(res);
        String temp=sb.reverse().toString();
        ans= res+temp;
        }
        
        else
        {
        s1=s.substring(0,n);
        System.out.print(s1);

        char[] ch=s1.toCharArray();
        Arrays.sort(ch);
        String res=new String(ch);
        StringBuilder sb = new StringBuilder(res);
        String temp=sb.reverse().toString();
        ans= res+String.valueOf(s.charAt(n))+temp;
        }
        return ans;
    }
}