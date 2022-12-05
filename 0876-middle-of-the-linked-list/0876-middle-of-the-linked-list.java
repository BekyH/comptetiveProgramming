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
    public ListNode middleNode(ListNode head) {
        int counter=0;
        if(head.next==null){
            return head;
        }
        ListNode current = head;
        while(current!=null){
            current = current.next;
            counter++;
        }
        
        
            counter = (counter/2) +1;
       
        
        ListNode curr = head;
        int count=1;
        while(curr!=null){
            curr = curr.next;
            count++;
            if(counter==count){
                break;
            }
        }
        return curr;
    }
}