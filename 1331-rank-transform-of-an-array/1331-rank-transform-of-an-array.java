class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int n=arr.length;
        if(n==0)return new int[]{};
        int[] temp=Arrays.copyOf(arr,n);
        Arrays.sort(temp);
        int rank=1;
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<n-1;i++)
        {
            if(temp[i]<temp[i+1])
            {
                map.put(temp[i],rank++);
            }
            else if(temp[i]==temp[i+1])
            {
                map.put(temp[i],rank);
            }
        }
        map.put(temp[n-1],rank);
        for(int i=0;i<n;i++)
        {
            arr[i]=map.get(arr[i]);
        }
        System.out.print(map);
        return arr;
    }
}