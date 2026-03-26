class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Stack<Integer> sand=new Stack<>();
        Queue<Integer> stu = new LinkedList<>();
        for(int i=sandwiches.length-1;i>=0;i--)
        sand.push(sandwiches[i]);
        for(int i=0;i<students.length;i++)
        stu.offer(students[i]);
        int rej=0;
        while(!stu.isEmpty()&&!sand.isEmpty())
        {
            if(sand.peek()==stu.peek())
            {
                stu.poll();
                sand.pop();
                rej=0;
            }
            else
            {
            stu.offer(stu.poll());
            rej++;
            }
            if(rej==stu.size())
            break;
        }
        return stu.size();

    }
}