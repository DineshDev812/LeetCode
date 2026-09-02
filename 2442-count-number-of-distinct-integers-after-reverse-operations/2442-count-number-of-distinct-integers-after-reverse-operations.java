class Solution {
    public int countDistinctIntegers(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            int num=nums[i];
            // System.out.println(num);
            int rev=0;
            while(num!=0)
            {
                int d=num%10;
                rev=rev*10+d;
                num/=10;
            }
            map.put(rev,map.getOrDefault(rev,0)+1);
            // System.out.println(rev);

        }
        // System.out.print(map);
        return map.size();

    }
}