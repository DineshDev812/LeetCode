class Solution {
    public int maxFreqSum(String s) {
        Map<Character,Integer> map1=new HashMap<>();
        Map<Character,Integer> map2=new HashMap<>();
        String vowels="aeiou";
        for(int i=0;i<s.length();i++)
        {
            if(vowels.indexOf(s.charAt(i))!=-1)
            {
                map1.put(s.charAt(i),map1.getOrDefault(s.charAt(i),0)+1);
            }
        }
        for(int i=0;i<s.length();i++)
        {
            if(vowels.indexOf(s.charAt(i))==-1)
            {
                map2.put(s.charAt(i),map2.getOrDefault(s.charAt(i),0)+1);
            }
        }
        int map1c=0;
        int map2c=0;
        for(Map.Entry<Character,Integer> h1:map1.entrySet())
        {
            if(h1.getValue()>map1c)
            {
                map1c=h1.getValue();
            }
        }
        for(Map.Entry<Character,Integer> h2:map2.entrySet())
        {
            if(h2.getValue()>map2c)
            {
                map2c=h2.getValue();
            }
        }
        return map1c+map2c;
    }
}