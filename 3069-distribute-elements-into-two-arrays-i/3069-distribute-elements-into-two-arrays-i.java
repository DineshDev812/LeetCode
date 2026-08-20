class Solution {
    public int[] resultArray(int[] nums) {

        List<Integer> li1= new ArrayList<>();
        List<Integer> li2= new ArrayList<>();
    
        int ind1=0,ind2=0;
        li1.add(nums[0]);
        li2.add(nums[1]);

        for(int i=2;i<nums.length;i+=1)
        {
            if(li1.get(ind1)>li2.get(ind2))
            {
                li1.add(nums[i]);
                ind1++;
            }
            else
            {
            li2.add(nums[i]);
            ind2++;
            }
        }

       li1.addAll(li2);
       for(int i=0;i<nums.length;i++)
       nums[i]=li1.get(i);
        return nums;
    }
}