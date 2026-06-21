class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int ind=-1;
        if(ruleKey.equals("type"))
        ind=0;
        else if(ruleKey.equals("color"))
        ind =1;
        else ind=2;
        int count=0;
        for(List a:items)
        {
            if(a.get(ind).equals(ruleValue))
            count++;
        }
        return count;
    }
}