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
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length==0){
            return null;
        }
        PriorityQueue<ListNode> min_heap = new PriorityQueue<ListNode>(lists.length, new                      Comparator<ListNode>() {
    public int compare(ListNode n1, ListNode n2) {
        return Integer.compare(n1.val,n2.val);
    }
});
        for(ListNode node:lists){
          ListNode curr = node;
            while(curr!=null){
                ListNode next = curr.next;
                curr.next = null;
                min_heap.add(curr);
                curr = next;
            }
        }
       // System.out.println(min_heap.size());
        ListNode head = min_heap.poll();
        ListNode current = head;
        while(!min_heap.isEmpty()){
            current.next = min_heap.peek();
            current = min_heap.poll();
        }
        
        
        return head;
    }
}
// Class NodeComparator implements Comparator<ListNode>{
    
//     public int compare(ListNode node1,ListNode node2){
//         if(node1.val>node2.val){
//             return 1;
//         }
//         else{
//             return -1;
//         }
//     }
    
// }

