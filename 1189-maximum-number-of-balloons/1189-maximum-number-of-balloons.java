class Solution {
    public int maxNumberOfBalloons(String text) {
        int[] arr = new int[5];
        for(int i=0;i<text.length();i++)
        {
            if(text.charAt(i)=='a')
            {
                arr[0]++;
            }
            else if(text.charAt(i)=='b')
            {
                arr[1]++;
            }
            else if(text.charAt(i)=='l')
            {
                arr[2]++;
            }
            else if(text.charAt(i)=='o')
            {
                arr[3]++;
            }
            else if(text.charAt(i)=='n')
            arr[4]++;
        }
        int a=arr[0];
        int b=arr[1];
        int c=arr[2]/2;
        int d=arr[3]/2;
        int e=arr[4];
        return Math.min(Math.min(a, b), Math.min(e, Math.min(c, d)));

    }
}