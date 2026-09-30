class Solution {
    public int distributeCandies(int[] candyType) {
        int n=candyType.length;
        Set<Integer> set = new HashSet<>();
        for(int i:candyType)
            set.add(i);
        int size=set.size();
        int a=n/2;
        return (a>size)?size:a;
    }
    
}