class Solution {
    public boolean stoneGameIX(int[] stones) {
       int[] arr = new int[3];
       for(int i:stones)
       arr[i%3]++;

       int c0=arr[0];
       int c1=arr[1];
       int c2=arr[2];

       if(c0%2==0)
       return c1>=1&&c2>=1;
       else
       return c1-c2>2||c2-c1>2;
    }
}