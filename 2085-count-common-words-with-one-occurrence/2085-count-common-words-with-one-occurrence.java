class Solution {
    public int countWords(String[] words1, String[] words2) {
        Map<String,Integer> map1=new HashMap<>();
        Map<String,Integer> map2=new HashMap<>();
        for(String s1:words1)
        {
            map1.put(s1,map1.getOrDefault(s1,0)+1);
        }
        for(String s2:words2)
        {
            map2.put(s2,map2.getOrDefault(s2,0)+1);
        }
        int c=0;
        for(Map.Entry<String,Integer> s:map1.entrySet())
        {
            if(map2.containsKey(s.getKey())&&(s.getValue()==1 && map2.get(s.getKey())==1))
            c++;
        }
        System.out.println(map1);        System.out.println(map2);

        return c;

    }
}