//import java.util.List;
//
//public class swapNode {
//        public static void main(String[] args){
//            ListNode n1 = new ListNode(1);
//            ListNode n2 = new ListNode(2);
//            ListNode n3 = new ListNode(3);
//            ListNode n4 = new ListNode(4);
//            n1.next = n2;
//            n2.next = n3;
//            n3.next = n4;
//            printNode(n1);
//            swapNodes(n1);
//            printNode(n1);
//
//
//
//        }
//
//
//    public static ListNode swapNodes(ListNode head) {
//        if (head == null) {
//            return null;
//
//
//        }
//        if (head.next == null) {
//            return head;
//        }
//        ListNode current = head;
//        ListNode temp = null;
//        while (current!=null && current.next != null) {
//            int k = current.val;
//            current.val = current.next.val;
//            current.next.val = k;
//
//
//
//            current = current.next.next;
//        }
//       // head = temp;
//        return head;
//    }
//    public static void printNode(ListNode head){
//            ListNode current = head;
//            while(current!=null){
//                System.out.print(current.val + " ");
//                current = current.next;
//            }
//            System.out.println();
//
//    }
//
//}
//class ListNode {
//    int val;
//    ListNode next;
//    ListNode() {}
//    ListNode(int val) { this.val = val; }
//    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//
//
//}