class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        TreeMap<Integer,String> map= new TreeMap<>(Collections.reverseOrder());
        String[] res= new String[names.length];

        for(int i=0;i<names.length;i++)
        {

            map.put(heights[i],names[i]);
        }

        // List<Map.Entry<String,Integer>> li = new ArrayList<>(map.entrySet());
        // li.sort(Map.Entry.comparingByValue(Collections.reverseOrder()));
        // System.out.print(map);
        int ind=0;
        for(Map.Entry<Integer,String> h:map.entrySet())
        {
            res[ind++]=h.getValue();
        }
        return res;


        
        
    }
}