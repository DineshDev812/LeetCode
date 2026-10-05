class Solution {
    public int scoreOfParentheses(String s) {
        int depth = 0;
        int ans = 0;
        for (int i = 0; i < s.length()-1; i++) {
            if (s.charAt(i) == '(') {
                depth++;
            } else {
                depth--;
            }
            if(s.charAt(i) == '(' && s.charAt(i + 1) == ')')
            {
                  ans+=1<<(depth-1);
            }
        }
        return  ans;

    }
}