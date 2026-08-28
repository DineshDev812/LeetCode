class Solution {
    public int[] separateDigits(int[] nums) {
        ArrayList<Integer> li = new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            String num=String.valueOf(nums[i]);
            // StringBuilder res=new StringBuilder();

            for(char ch:num.toCharArray())
            li.add(ch-'0');
        }
        int[] arr=new int[li.size()];
        int j=0;
        for(int i:li)
        arr[j++]=i;
        return arr;
    }
}