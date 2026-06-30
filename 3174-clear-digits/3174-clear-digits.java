class Solution {
    public String clearDigits(String s) {
        Stack<Character> st = new Stack<>();

        for(int i=0;i<s.length();i++)
        {
            if(Character.isLetter(s.charAt(i)))
            st.push(s.charAt(i));

            else
            st.pop();
        }
        String res="";
        while(!st.isEmpty())
        {
            res+=st.pop();
        }
        StringBuilder sb = new StringBuilder(res);

        return sb.reverse().toString();
    }
}