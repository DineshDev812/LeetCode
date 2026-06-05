/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[] nextLargerNodes(ListNode head) {
        Stack<Integer> st = new Stack<>();
        ListNode cur=head;
        ListNode prev=null;
        ListNode next=null;
        int c=0;
        while(cur!=null)
        {
            next=cur.next;
            cur.next=prev;
            prev=cur;
            cur=next;
            c++;
        }
        ListNode temp=prev;
        int[] arr = new int[c];
        int ind=c-1;
        while(temp!=null)
        {
            while(!st.isEmpty()&&temp.val>=st.peek())
            {
                st.pop();
            }
            if(st.isEmpty())
            arr[ind--]=0;
            else
            arr[ind--]=st.peek();

            st.push(temp.val);
            temp=temp.next;

        }
        return arr;
    }
}