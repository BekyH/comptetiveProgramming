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
        int size = 0;
        ListNode current = head;
        while(current!=null){
            current = current.next;
            size++;
        }
        
        int index= size-n;
        if(index==0){
            current = head.next;
            head.next = null;
            return current;
        }
        int i =0;
        current = head;
        while(i<index-1){
            current = current.next;
            i++;
        }
        //System.out.println(current.val);
        ListNode temp = current.next;
        current.next = current.next.next;
        temp.next= null;
        
        return head;
        
    }
}