class Solution {
    public int countSegments(String s) {
        
        String ans=s.trim();
        if(ans.length()==0)
        return 0;
        String[] arr=ans.split("\\s+");
        return arr.length;
    }
}