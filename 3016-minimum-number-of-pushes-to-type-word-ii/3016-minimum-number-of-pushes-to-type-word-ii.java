class Solution {
    public int minimumPushes(String word) {
        int count=0;
        Map<Character,Integer> map = new HashMap<>();
        for(char ch:word.toCharArray())
        map.put(ch,map.getOrDefault(ch,0)+1);
       int i=0;
       int ans=0;
       List<Map.Entry<Character,Integer>> li = new ArrayList<>(map.entrySet());

       Collections.sort(li, (a, b) -> b.getValue().compareTo(a.getValue()));
       Map<Character,Integer> sortedMap= new LinkedHashMap<>();
        for(Map.Entry<Character,Integer> h:li)
        {
           sortedMap.put(h.getKey(),h.getValue());
        }


        // System.out.println(sortedMap);
       for(Map.Entry<Character,Integer> h:sortedMap.entrySet())
       {
          count=((i/8)+1); //*h.getValue();
          i++;
          ans+=count*h.getValue();
        //   System.out.println(count+" "+h.getValue());
       }
        // for(int i=0;i<word.length;i++)
        // {
        //     count+=(i/8)+1;

        // }
        return ans;
    }
}