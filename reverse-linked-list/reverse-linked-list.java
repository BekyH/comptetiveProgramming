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
    public ListNode reverseList(ListNode head) {
        if(head == null){
            return head;
        }
        return reverse(head,null);
    }
    public ListNode reverse(ListNode current,ListNode prev){
        if(current.next==null){
            current.next = prev;
            return current;
        }
        ListNode head =  reverse(current.next,current);
        current.next = prev;
        return head;
        
    }
}