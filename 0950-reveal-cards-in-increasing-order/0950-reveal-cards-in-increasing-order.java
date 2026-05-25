class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        Arrays.sort(deck);
        int n =deck.length;
        Queue<Integer> q = new LinkedList<>();

        for(int i=0;i<n;i++)
        {
            q.offer(i);
        }

        int [] ans = new int[n];

        for(int m:deck)
        {
            int ind=q.poll();
            ans[ind]=m;

            if(!q.isEmpty())
            {
                q.offer(q.poll());
            }
        }
        return ans;
        
    }
}