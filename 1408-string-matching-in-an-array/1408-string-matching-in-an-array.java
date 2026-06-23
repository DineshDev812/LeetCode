class Solution {
    public List<String> stringMatching(String[] words) {
        List<String> li = new ArrayList<>();
        for(int i=0;i<words.length;i++)
        {
            for(int j=0;j<words.length;j++)
            {
                if(words[i].contains(words[j])&&i!=j)
                {
                    if(!li.contains(words[j]))
                    li.add(words[j]);
                }
            }
        }
        return li;
    }
}