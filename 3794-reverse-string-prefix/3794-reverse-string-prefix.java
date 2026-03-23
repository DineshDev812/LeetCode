class Solution {
    public String reversePrefix(String s, int k) {
        String m=s.substring(0,k);
        StringBuilder sb = new StringBuilder(m).reverse();
        return sb.toString()+s.substring(k);
        
    }
}