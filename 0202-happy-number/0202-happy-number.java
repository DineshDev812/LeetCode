class Solution {
    public boolean isHappy(int n) {
       
        Set<Integer> set = new HashSet<>();
        while(n!=1)
        {
             int h =n;
             int sum =0;
             while(h!=0)
             {
                int d=h%10;
                sum+=Math.pow(d,2);
                h/=10;
             }
             if(!set.contains(sum))
             {
             set.add(sum);
             n=sum;
             }
             else
             return false;
        }
        return true;
        
    }
}