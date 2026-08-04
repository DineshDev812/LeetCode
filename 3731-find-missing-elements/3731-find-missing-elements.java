class Solution {
    public List<Integer> findMissingElements(int[] nums) {
       List<Integer> li = new ArrayList<>();
       int max=Integer.MIN_VALUE;
       int min=Integer.MAX_VALUE;
       for(int i:nums)
       {
        if(i>max)
        max=i;
        if(i<min)
        min=i;
       li.add(i);
       }
       List<Integer> res= new ArrayList<>();
       for(int i=min;i<=max;i++)
       {
        if(!li.contains(i))
        res.add(i);
       }
       return res;
    }
}