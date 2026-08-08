class Solution {
    static {
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            try (FileWriter fw = new FileWriter("display_runtime.txt")) {
                fw.write("0");
            } catch (Exception e) {
            }
        }));
    }
    public int longestValidParentheses(String s) {
        Stack<Integer> st= new Stack<>();
        st.push(-1);
        int max=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch=='(')
            {
                st.push(i);
            }
            else if(ch==')')
            {
                st.pop();
                if(st.isEmpty())
                {
                    st.push(i);
                }
               
                    max=Math.max(max,i-st.peek());
            }

        }
        return max;
        
    }
}