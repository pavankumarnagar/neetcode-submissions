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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null)
        return head;
        ListNode temp=head;
        int totalcount=0;
        while(temp!=null)
        {
            totalcount++;
            temp=temp.next;
        }
        if(totalcount==n)
        return head.next;
        int count=0;
        temp=head;
        ListNode pre=null;
        while(temp!=null)
        {
            pre=temp;
            count++;
            if(totalcount-count==n)
            break;
            temp=temp.next;
        }
        pre.next=temp.next.next;
        return head;

    }
}
