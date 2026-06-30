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
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null||head.next==null){return head;}
        ListNode dum = new ListNode(-1);
        dum.next=head;
        ListNode t2 = head;
        ListNode temp = dum;
        while(t2!=null && t2.next!=null){
            if(t2.val==t2.next.val){
                while (t2.next != null && t2.val == t2.next.val) {
                    t2 = t2.next;
                }
                temp.next=t2.next;
            }
            else{
                temp=temp.next;
            }
            t2=t2.next;
        }return dum.next;
    }
}