class Solution {
    public int countPoints(String rings) {
        boolean[] a1= new boolean[26];
        boolean[] a2= new boolean[26];
        boolean[] a3= new boolean[26];
        int ans=0;
        if(rings.length()==2)
        return 0;
        for(int i=0;i<rings.length()-1;i+=2)
        {
            if(rings.charAt(i)=='B')
            {
                a1[rings.charAt(i+1)-'0']=true;
            }
            else if(rings.charAt(i)=='G')
            {
                a2[rings.charAt(i+1)-'0']=true;
            }
            else if(rings.charAt(i)=='R')
            {
                a3[rings.charAt(i+1)-'0']=true;
            }
        }
        for(int i=0;i<a1.length;i++)
        {
            if(a1[i]&&a2[i]&&a3[i])
            ans++;
        }
        System.out.println(Arrays.toString(a1));
        System.out.println(Arrays.toString(a2));
        System.out.print(Arrays.toString(a3));
        return ans;
    }
}