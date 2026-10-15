class Solution {
    public static boolean isPalindrome(String s,int left,int right)
    {
        if(s.length()==1)
        return true;
        while(left<right)
        {
            if(s.charAt(left)!=s.charAt(right))
            return false;
            else
            {
                left++;
                right--;
            }
        }
        return true;
    }

    public static void backtrack( List<List<String>> res , List<String> ans, String s, int st)
    {
        if(st==s.length())
        {
            res.add(new ArrayList<>(ans));
            return;
        }

        for(int i=st;i<s.length();i++)
        {
            if(isPalindrome(s,st,i))
            {

                ans.add(s.substring(st,i+1));
                backtrack(res,ans,s,i+1);
                ans.remove((ans.size()-1));
            }
        }
    }
    public List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<>();
        List<String> ans = new ArrayList<>();

        backtrack(res, ans, s, 0);
        return res;
    }
}