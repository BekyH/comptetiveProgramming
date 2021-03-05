import java.util.ArrayList;
import java.util.List;

public class reverseLinked {
    public ListNode reverseList(ListNode head) {

        if(head==null || head.next==null){
            return head;
        }
        List<ListNode> result = new ArrayList<>();
        reverseListHelper(head,result);
        return result.get(0);

    }
    public ListNode reverseListHelper(ListNode head,List<ListNode> result){
        if(head.next==null){
            result.add(head);
            return head;
        }
        ListNode node = reverseListHelper(head.next,result);
        head.next = null;
        node.next = head;
        return head;
    }

}


 class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

