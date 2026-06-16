class Solution {
    public String processStr(String s) {
        char[] ch=s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<ch.length;i++)
        {
            if(Character.isLetter(ch[i]))
            {
            sb.append(ch[i]);
            }
            else if(ch[i]=='#')
            {
            sb.append(sb);
            }
            else if(ch[i]=='%')
            {
            sb.reverse();
            }
            else if(ch[i]=='*')
            {
                if(sb.length()>0)
            sb.deleteCharAt(sb.length()-1);
           
            }
            else
            break;
        }
        return sb.toString();
    }
}