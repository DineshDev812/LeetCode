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
    public boolean isPalindrome(ListNode head) {
        if(head==null||head.next==null)
        return true;
        if(head.next.next==null)
        {
            return head.val==head.next.val;
        }
        ListNode fast=head,slow=head;
        while(fast!=null&&fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode fh=head;

        ListNode sh=slow;
        slow=null;
        ListNode prev=null,next=null;
        while(sh!=null)
        {
            next=sh.next;
            sh.next=prev;
            prev=sh;
            sh=next;

        }
        while(fh!=null&&prev!=null)
        {
            if(fh.val!=prev.val)
            return false;
            fh=fh.next;
            prev=prev.next;

        }
        return true;
    }
}