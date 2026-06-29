class Solution {
    public String toGoatLatin(String sentence) {
        String vowel="aeiouAEIOU";
        String[] arr = sentence.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<arr.length;i++)
        {
            String word="ma";
            int j;
            for( j=0;j<=i;j++)
            {
                word+="a";
            }
            if(vowel.indexOf((arr[i].substring(0,1)))!=-1)
            {
                sb.append(arr[i]).append(word);
                            

            }
            else{
                sb.append(arr[i].substring(1)).append(arr[i].substring(0,1)).append(word); 

            }
            if(i!=arr.length-1)
            sb.append(" ");


        }
        return sb.toString();
    }
}