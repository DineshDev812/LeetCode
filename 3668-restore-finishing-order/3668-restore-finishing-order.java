class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        ArrayList<Integer> friend= new ArrayList<>();
        ArrayList<Integer> ans= new ArrayList<>();
        for(int i:friends)
        friend.add(i);
        for(int i:order)
        {
            if(friend.contains(i))
            ans.add(i);
        }
        int[] arr= new int[ans.size()];
        int j=0;
        for(int i:ans)
        arr[j++]=i;
        return arr;


    }
}