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
    public ListNode detectCycle(ListNode head) {
        boolean hasCycle = false;
        if(head==null || head.next==null){
            return null;
        }
        ListNode slowpointer = head;
        ListNode fastpointer = head;
        while(fastpointer!=null && fastpointer.next!=null){
              
            fastpointer = fastpointer.next.next;
            slowpointer = slowpointer.next;
            if(fastpointer==slowpointer){
                  hasCycle = true;
                 break;
              }
        }
        if(!hasCycle){
            return null;
        }
        
        slowpointer = head;
        while(fastpointer!=slowpointer){
            fastpointer = fastpointer.next;
            slowpointer = slowpointer.next;
        }
        
        return slowpointer;

    }
}