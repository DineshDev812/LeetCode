class Solution {
    public int[] separateDigits(int[] nums) {
        ArrayList<Integer> li = new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            int num=nums[i];
            StringBuilder res=new StringBuilder();
            while(num!=0)
            {
                int d=num%10;
                res.append(String.valueOf(d));
                num/=10;
            }
            String ans=res.reverse().toString();
            for(char ch:ans.toCharArray())
            li.add(ch-'0');
        }
        int[] arr=new int[li.size()];
        int j=0;
        for(int i:li)
        arr[j++]=i;
        return arr;
    }
}