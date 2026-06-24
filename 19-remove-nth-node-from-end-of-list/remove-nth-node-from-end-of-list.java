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

//  THIS SOLUTION TAKES 
//  O(n) time complexity 
//  O(1) space complexity

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
       ListNode temp = head;
       ListNode dummy = head;
       if(head==null||head.next==null){
        return null;
       }
       for(int i = 0;i<n;i++){
            temp = temp.next;
       }
       if(temp == null)return head.next;

       while(temp.next!=null){
        temp = temp.next;
        dummy = dummy.next;
       }
       if(dummy.next!=null){
            dummy.next = dummy.next.next;
        }
       return head;
    }
}