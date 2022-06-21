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
    public boolean hasCycle(ListNode head) {
        if(head==null || head.next==null){
            return false;
        }
        ListNode sp = head;
        ListNode fp = head.next;
        while(fp!=null && fp.next!=null){
              if(fp==sp || fp.next==sp){
                  return true;
              }
            fp = fp.next.next;
            sp = sp.next;
        }
        return false;
    }
}