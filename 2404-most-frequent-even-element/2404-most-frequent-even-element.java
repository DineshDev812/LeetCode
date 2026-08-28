class Solution {
    public int mostFrequentEven(int[] nums) {
       
        Map<Integer,Integer> map = new HashMap<>();
        for(int n: nums)
        {
            map.put(n,map.getOrDefault(n,0)+1);
        }
        int element=Integer.MAX_VALUE,max=-1;
         System.out.println(map);
        for(Map.Entry<Integer,Integer> b:map.entrySet())
        {
            if(b.getKey()%2==0&&b.getValue()>max)
            {
                
               max= b.getValue();
               element=b.getKey();
            //    System.out.println(max);
            //    System.out.println(element);
            }
            else if(b.getKey()%2==0&&b.getValue()==max)
            {
                element=Math.min(element,b.getKey());
            }
        }
      return (element==Integer.MAX_VALUE)?-1:element;  
    }
}