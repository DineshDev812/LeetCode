class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        ArrayList<Integer> friend= new ArrayList<>();

        for(int i:friends)
        friend.add(i);
        
        int[] arr= new int[friends.length];
        int j=0;
        for(int i:order)
        {
            if(friend.contains(i))
            arr[j++]=i;
        }
      
       
        return arr;


    }
}