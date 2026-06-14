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
    public int pairSum(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null&&fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode cur=slow;
        slow=null;

        ListNode prev=null;
        ListNode next=null;
        while(cur!=null)
        {
            next=cur.next;
            cur.next=prev;
            prev=cur;
            cur=next;
        }

        ListNode oldhead=head;
        ListNode newhead=prev;
        int sum=0;
        while(oldhead!=null && newhead!=null)
        {
            System.out.println(oldhead.val+" "+newhead.val);
            sum=Math.max(sum,oldhead.val+newhead.val);
            oldhead=oldhead.next;
            newhead=newhead.next;

        }
        return sum;
        
    }
}