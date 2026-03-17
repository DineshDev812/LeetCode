class Solution {
    public boolean isPalindrome(int x) {
        int a = x;
        int rev = 0;
        while(x>0)
        {
            rev=rev*10 + x%10;
            x=x/10;

        }
        if(a==rev)
        {
        return true;
        }
        return false;
    }
}