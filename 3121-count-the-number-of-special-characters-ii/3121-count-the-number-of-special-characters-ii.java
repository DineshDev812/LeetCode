class Solution {
    public int numberOfSpecialChars(String word) {

        char[] ch = word.toCharArray();

        int c = 0;

        for(char k = 'a'; k <= 'z'; k++)
        {
            int lastLower = -1;
            int firstUpper = -1;

            // find last lowercase position
            for(int i = 0; i < ch.length; i++)
            {
                if(ch[i] == k)
                    lastLower = i;
            }

            // find first uppercase position
            for(int i = 0; i < ch.length; i++)
            {
                if(ch[i] == (char)(k - 32))
                {
                    firstUpper = i;
                    break;
                }
            }

            // special character condition
            if(lastLower != -1 &&
               firstUpper != -1 &&
               lastLower < firstUpper)
            {
                c++;
            }
        }

        return c;
    }
}