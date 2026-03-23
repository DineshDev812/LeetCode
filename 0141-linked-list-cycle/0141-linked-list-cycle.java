/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode sl=head;
        ListNode ft=head;
        while(ft!=null&&ft.next!=null)
        {

            sl=sl.next;
            ft=ft.next.next;
            if(sl==ft)
            return true;
        }
       return false;
        
    }
}