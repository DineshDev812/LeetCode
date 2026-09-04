class Solution {
    public String sortSentence(String s) {
        String[] arr=s.split(" ");
         String[] res=new String[arr.length];
        // System.out.println("val"+arr.length);
        for(int i=0;i<arr.length;i++)
        {
        // System.out.println(arr[i]+"  ");

            // int ind=arr[i].length()-1;
            int n=arr[i].length()-1;
            String sub=arr[i].substring(0,n);
             int val=Integer.parseInt(String.valueOf(arr[i].charAt(n)));
             res[val-1]=sub;
            //  System.out.println(sub+"  ");
            //  System.out.println(val);
        }
        return String.join(" ",res);
    }
}