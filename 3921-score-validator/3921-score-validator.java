class Solution {
    public int[] scoreValidator(String[] events) {
        int score=0;
        int counter=0;
        for(int i=0;i<events.length;i++)
        {
            if(counter<10)
            {
            if(events[i].equals("W"))
            counter++;
            else if(events[i].equals("WD"))
            score++;
            else if(events[i].equals("NB"))
            score++;
            else
            score+=Integer.parseInt(events[i]);
            }
            else
            break;

        }
        int[] arr=new int[2];
        arr[0]=score;
        arr[1]=counter;
        return arr;
    }
}