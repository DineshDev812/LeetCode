class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res= new ArrayList<>();

        char[] ch1=p.toCharArray();
        Arrays.sort(ch1);
        int l=0;
        int r=p.length();
        while(r<=s.length())
        {
            String str=s.substring(l,r);
            char[] ch=str.toCharArray();
            Arrays.sort(ch);
            if(Arrays.equals(ch1,ch))
            res.add(l);

            l++;
            r++;
        
        }
        return res;
    }

}