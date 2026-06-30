class Solution {
    public String largestEven(String s) {
        String res="";
        int ind=s.lastIndexOf("2");

        return s.substring(0,ind+1);
    }
}