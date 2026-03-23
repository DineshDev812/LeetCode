class Solution {
    public String reversePrefix(String word, char ch) {
        char ch1[]=word.toCharArray();
        int index=word.indexOf(ch);
        int l=0;
        if(index==-1)
        return word;
        while(l<index)
        {
            char temp=ch1[l];
            ch1[l]=ch1[index];
            ch1[index]=temp;
            l++;
            index--;
        }
        return new String(ch1);
        
    }
}