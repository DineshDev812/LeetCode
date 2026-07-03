class Solution {
    public boolean checkString(String s) {
        int ind=s.lastIndexOf('a');

        for(int i=0;i<ind;i++)
        {
            if(s.charAt(i)=='b')
            return false;
        }
        return true;
    }
}