package comptetiveProgramming.septDaily;

public class reverselinkedlist {
    public ListNode reverseList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }

        ListNode current = head;
        ListNode node = null;
        ListNode prev = null;
        while(current!=null){
            node = current.next;
            current.next = prev;
            prev = current;
            current = node;

        }
        return prev;
    }
    //brute force way
//      if(head==null || head.next==null){
//        return head;
//    }
//    ListNode current = head;
//    ListNode node = null;
//    List<ListNode> list = new ArrayList<>();
//        while(current!=null){
//        node = current;
//        current = current.next;
//        node.next=null;
//        list.add(node);
//
//    }
//        Collections.reverse(list);
//        for(int i=1;i<list.size();i++){
//        list.get(i-1).next = list.get(i);
//    }
//
//        return list.get(0);
}
class ListNode {
    int val;
     ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

