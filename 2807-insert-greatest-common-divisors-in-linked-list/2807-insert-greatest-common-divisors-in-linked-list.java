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
    public int gcd(int a,int b)
    {
                    // System.out.println(l1.val+" "+l2.val);
        while(b!=0)
        {
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if(head==null||head.next==null)
        return head;

        ListNode temp=head.next;
        ListNode prev=head;
        while(temp!=null)
        {
            ListNode newnode=new ListNode(gcd(prev.val,temp.val));
             
             prev.next=newnode;
             newnode.next=temp;
            // temp.next=newnode;

            // temp=newnode;
            // System.out.println(temp.next.val);
            prev=newnode.next;


            temp=temp.next;
        }
        return head;
    }
}