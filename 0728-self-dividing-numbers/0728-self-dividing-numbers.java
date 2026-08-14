class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> li = new ArrayList<>();
        for(int i=left;i<=right;i++)
        {
            int num=i;
            int a=i;
            boolean flag=true;
            while(num!=0)
            {
                int d=num%10;
                if(d==0)
                {
                    flag=false;
                    break;
                }
                else if(a%d!=0)
                {
                    flag=false;
                    break;
                }
                num/=10;

            }
            if(flag)
            li.add(i);
        }
        return li;
    }
}