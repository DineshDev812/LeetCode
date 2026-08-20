class Solution {
    public int[] resultArray(int[] nums) {
        int n;
        if(nums.length%2==0)
         n =nums.length/2;
        else
         n=nums.length/2+1;

        List<Integer> li1= new ArrayList<>();
        List<Integer> li2= new ArrayList<>();
    
        int[] res= new int[nums.length];
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

        // if(li1.get(ind1-1)>li2.get(ind2-1))
        // li1.add(nums[nums.length-1]);
        // else
        // li2.add(nums[nums.length-1]);
         int ind=-1;
       for(int i:li1)
       res[++ind]=i;
       for(int i:li2)
       res[++ind]=i;
       System.out.println(li1);
       System.out.println(li2);
        return res;
        
    }
}