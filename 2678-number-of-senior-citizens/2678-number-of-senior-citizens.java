class Solution {
    public int countSeniors(String[] details) {
        int c=0;
        for(int i=0;i<details.length;i++)
        {
        String age=details[i].substring(details[i].length()-4,details[i].length()-2);
        
        if(Integer.parseInt(age)>60)
        c++;
        }
        return c;
    }
}