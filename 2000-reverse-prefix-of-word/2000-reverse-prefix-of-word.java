class Solution {
    public String reversePrefix(String word, char ch) {
        if(word.contains(String.valueOf(ch)))
        {
        char ch1[] = word.toCharArray();
        String s="";
        int ind=0;
        for(int i=0;i<ch1.length;i++)
        {
            if(ch!=ch1[i])
            s+=ch1[i];
            else
            {
                s+=ch1[i];
                ind=i;
            break;
            }

        }
        String sb = new StringBuilder(s).reverse().toString();
        for(int i=ind+1;i<ch1.length;i++)
        sb+=ch1[i];
        return sb ;
        }
        else
        return word;
        
    }
}