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
    public boolean isPalindrome(ListNode head) {
        Deque<ListNode> deque = new ArrayDeque<>();
        ListNode curr = head;
        while(curr!=null){
            deque.add(curr);
            curr = curr.next;
        }
        
        
        while(deque.size()>=2){
            ListNode first = deque.pollFirst();
            ListNode last = deque.pollLast();
            if(first.val!=last.val){
                return false;
            }
        }
        
        return true;
    }
}