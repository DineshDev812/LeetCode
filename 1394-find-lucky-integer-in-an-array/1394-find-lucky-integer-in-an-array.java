class Solution {
    public int findLucky(int[] arr) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int n:arr)
        {
            map.put(n,map.getOrDefault(n,0)+1);
        }
        int max =-1;
        for(Map.Entry<Integer,Integer> c:map.entrySet())
        {
    //          System.out.println("Key: " + c.getKey() + ", Value: " + c.getValue());
    // System.out.println("Condition true? " + (c.getKey() == c.getValue()));
            if((int)c.getKey()==(int)c.getValue()&&c.getKey()>max)
            {
                max=c.getKey();
                
            }
        }
        return max;
    }
}