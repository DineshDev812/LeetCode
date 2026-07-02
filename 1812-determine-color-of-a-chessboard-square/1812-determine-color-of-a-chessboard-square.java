class Solution {
    public boolean squareIsWhite(String coordinates) {
        int num=(int)coordinates.charAt(0)+coordinates.charAt(1)-'0';
        return num%2!=0;
    }
}