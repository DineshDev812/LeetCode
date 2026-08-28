class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        List<Integer> left= new ArrayList<>();
        List<Integer> right= new ArrayList<>();
        int count=0;
        for(int i:nums)
        {
            if(i<pivot)
            left.add(i);
            else if(i>pivot)
            right.add(i);
            if(i==pivot)
            count++;
        }
        while(count-->0)
        left.add(pivot);

        left.addAll(right);
        int[] arr = new int[nums.length];
        System.out.print(left);
        for(int i=0;i<nums.length;i++)
        {
            arr[i]=left.get(i);
        }
        return arr;
    }
}