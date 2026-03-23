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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null)
        return null;
        if(head.next==null)
        return head;
        ListNode t=head;
        int c=0;
        while(t!=null)
        {
            t=t.next;
            c++;
        }
        k=k%c;
        for(int i=0;i<k;i++)
        {
            ListNode temp=head;
            while(temp.next.next!=null)
            {
            temp=temp.next;
            }
        
            temp.next.next=head;
            head=temp.next;
            temp.next=null;
        }
    return head;
        
    }
}