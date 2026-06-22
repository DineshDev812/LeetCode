class Solution {
    public int maxNumberOfBalloons(String text) {
        // String s="balloon";
        // Map<Character,Integer> map = new HashMap<>();
        // for(char ch:text.toCharArray())
        // {
        //     map.put(ch,map.getOrDefault(ch,0)+1);
        // }
        // System.out.println(map);
        // int c=0;
        // for(Map.Entry<Character,Integer> h:map.entrySet())
        // {
           
        // }

        int[] arr = new int[5];

        for(int i=0;i<text.length();i++)
        {
            if(text.charAt(i)=='a')
            {
                arr[0]++;
            }
            else if(text.charAt(i)=='b')
            {
                arr[1]++;
            }
            else if(text.charAt(i)=='l')
            {
                arr[2]++;
            }
            else if(text.charAt(i)=='o')
            {
                arr[3]++;
            }
            else if(text.charAt(i)=='n')
            arr[4]++;
        }
        int a=arr[0];
        int b=arr[1];
        int c=arr[2]/2;
        int d=arr[3]/2;
        int e=arr[4];
        int a1=Math.min(a,b);
        int a2=Math.min(a1,c);
        int a3=Math.min(a2,d);
        int a4=Math.min(a3,e);
        return a4;
    }
}