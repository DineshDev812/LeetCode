class Solution {
    public boolean checkIfPangram(String sentence) {
        if(sentence.length()<26)
        {
            return false;
        }
       Map<Character,Integer> map=new HashMap<>();
       for(char ch:sentence.toCharArray())
       {
        map.put(ch,map.getOrDefault(ch,0)+1);
       }
       if(map.size()==26)
       return true;
       else
       return false;
    }
}