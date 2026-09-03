class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> res=new ArrayList<>();
        List<Integer> li = new ArrayList<>();
        for(int i:target)
        li.add(i);

        // String present="Push";
        // String absent2="Pop";

        // res.add(present);
        int len=target[target.length-1];
        for(int i=1;i<=len;i++)
        {
            if(li.contains(i))
            {
                res.add("Push");
            }
            else
            {
                res.add("Push");
                res.add("Pop");
            }
        }
        return res;
    }
}