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
    public ListNode deleteMiddle(ListNode head) {
        if(head.next==null){
            return null;
        }
        int length = 0;
        ListNode current = head;
        while(current!=null){
            length++;
            current = current.next;
        }
        int mid = length/2;
        int prevmid = mid;
        int counter = 0;
        current = head;
        ListNode prev = null;
        ListNode next = null;
        while(current!=null){
            counter++;
            if(counter==prevmid){
                break;
            }
            current = current.next;
        }
        if(current.next!=null){
             prev = current;
        current = current.next;
        next = current.next;
        
        prev.next =next;
        current.next = null;
        }
       
        
        return head;
    }
}