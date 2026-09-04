class Solution {
    public String sortSentence(String s) {
        String[] arr=s.split(" ");
         String[] res=new String[arr.length+1];
        // System.out.println("val"+arr.length);
        for(int i=0;i<arr.length;i++)
        {
        // System.out.println(arr[i]+"  ");

            // int ind=arr[i].length()-1;
            int n=arr[i].length()-1;
            String sub=arr[i].substring(0,n);
             int val=Integer.parseInt(String.valueOf(arr[i].charAt(n)));
             res[val]=sub;
            //  System.out.println(sub+"  ");
            //  System.out.println(val);
        }
        String ans="";
        for(int i=1;i<res.length;i++)
        {
        ans+=res[i];
        if(i<res.length-1)
        ans+=" ";
        }

        // System.out.print(Arrays.toString(res));
        return ans;
    }
}