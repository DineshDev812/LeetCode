class Solution {
    public String convert(String s, int numRows) {
        StringBuilder[] sb = new StringBuilder[numRows];
        for(int i=0;i<numRows;i++)
        {
            sb[i]=new StringBuilder();
        }

        char[] ch= s.toCharArray();
        int len=ch.length;
        int index=0;

        while(index<len)
        {
            //downwards
            for(int i=0;i<numRows&&index<len;i++)
            {
                sb[i].append(ch[index++]);
                
            }
            //upwards
            for(int i=numRows-2;i>0&&index<len;i--)
            {
                sb[i].append(ch[index++]);
            }
        }

        StringBuilder res=sb[0];
        for(int i=1;i<numRows;i++)
        {
            res.append(sb[i].toString());
        }
        return res.toString();
    }
}