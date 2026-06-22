class Solution {
    public String trimTrailingVowels(String s) {
        Stack<Character> st= new Stack<>();
        for(int i=0;i<s.length();i++)
        {
        st.push(s.charAt(i));
        }
        StringBuilder res=new StringBuilder();
        String vow="aeiou";
        while(!st.isEmpty())
        {
            if(vow.indexOf(st.peek())!=-1)
            {
                st.pop();
            }
            else
            break;
        }
        while(!st.isEmpty())
        res.append(st.pop());
        return res.reverse().toString();
    }
}