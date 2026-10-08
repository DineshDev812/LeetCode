class Solution {
    public String decodeString(String s) {
        Stack<Character> st=new Stack<>();
        String res="";
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch!=']')
            {
                st.push(s.charAt(i));
            }
            else
            {
                char c='\0';
                String key="";
                String str="";
                while((c=st.pop())!='[')
                {
                    str=c+str;
                    
                }
                while(!st.isEmpty() && Character.isDigit(st.peek()))
                {
                    key=st.pop()+key;
                }
                str=str.repeat(Integer.parseInt(key));

                for(int j=0;j<str.length();j++)
                {
                    st.push(str.charAt(j));
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty())
        {
            sb.append(st.pop());
        }
        return sb.reverse().toString();
    }
}