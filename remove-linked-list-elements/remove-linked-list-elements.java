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
    public ListNode removeElements(ListNode head, int val) {
             if(head==null){
            return null;
        }
        ListNode current = head;
        ListNode prev = null;
        while(current!=null && current.val==val){
            head = current.next;
            current = head;


        }
        while(current!=null){
            while(current!=null && current.val!=val){
                prev = current;
                current = current.next;

            }
            if(current==null){
                return head;
            }
            prev.next = current.next;

            current = prev.next;
        }
        
        
        return head;

    
}
}