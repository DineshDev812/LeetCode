class Solution {
    public String kthDistinct(String[] arr, int k) {
        Map<String,Integer> map = new LinkedHashMap<>();
        for(String s:arr)
        map.put(s,map.getOrDefault(s,0)+1);
        String ans="";
        int c=0;
        // System.out.println(map);
        for(Map.Entry<String,Integer> h:map.entrySet())
        {
            if(h.getValue()==1)
            {
               ++c;
                if(c==k)
                {
                return h.getKey();
                
                }
            }
        }
        return "";
    }
}