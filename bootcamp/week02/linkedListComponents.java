package com.company;

import java.util.HashSet;

public class linkedListComponents {
    public int numComponents(ListNode head, int[] G) {
        HashSet<Integer> set = new HashSet<>();
        int counter = 0;
        for(int i:G){
            set.add(i);
        }
        ListNode current = head;
        while(current!=null){
            ListNode nxt = null;
            if(current.next!=null){
                nxt = current.next;

            }
            if(set.contains(current.val) && nxt!=null && !set.contains(nxt.val)){
                counter++;

            }
            else if(set.contains(current.val) && current.next==null){
                counter++;

            }
            current= current.next;
        }

        return counter;
    }
}
 class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

