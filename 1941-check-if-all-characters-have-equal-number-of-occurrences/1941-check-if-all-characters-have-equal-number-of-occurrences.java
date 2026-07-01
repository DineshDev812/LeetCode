class Solution {
    public boolean areOccurrencesEqual(String s) {
        Map<Character,Integer> map = new HashMap<>();
        for(char ch:s.toCharArray())
        {
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        int c=map.get(s.charAt(0));
        for(Map.Entry<Character,Integer> h:map.entrySet())
        {
            if(h.getValue()!=c)
            return false;
        }
        return true;
    }
}