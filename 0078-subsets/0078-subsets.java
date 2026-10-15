class Solution {
    public static void backtrack(List<List<Integer>> li, List<Integer> list,int[] arr, int st)
    {
        li.add(new ArrayList<>(list));
        for(int i=st;i<arr.length;i++)
        {
            list.add(arr[i]);
            backtrack(li,list,arr,i+1);
            list.remove(list.size()-1);
        }
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
       backtrack(list,new ArrayList<>(),nums,0);
       return list;
        
    }
}