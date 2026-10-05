class Solution {
    public boolean checkRecord(String s) {
        int present=0,late=1,absent=0;
        for(char ch:s.toCharArray())
            if(ch=='A')
                absent++;
        for(int i=0;i<s.length()-1;i++)
        {
            
            if(s.charAt(i)=='L'&&s.charAt(i+1)=='L')
                late++;
            else
            {
                late=1;
            }
            if(late>=3)
                return false;
            
        }
        System.out.print(absent);
        return (absent<2)?true:false;
    }
}