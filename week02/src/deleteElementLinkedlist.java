public class deleteElementLinkedlist {
    public void deleteNode(ListNode node) {
        ListNode nextnode= node.next;
        node.val = nextnode.val;
        node.next = nextnode.next;
    }
}

//    public static void main(String[]args){
//
//    }
//    public Noode removeElements(Noode head, int val) {
//        if(head==null){
//            return null;
//        }
//        Noode current = head;
//        Noode prev = null;
//        while(current!=null && current.val==val){
//            head = current.next;
//            current = head;
//
//
//        }
//        while(current!=null){
//            while(current!=null && current.val!=val){
//                prev = current;
//                current = current.next;
//
//            }
//            if(current==null){
//                return head;
//            }
//            prev.next = current.next;
//
//            current = prev.next;
//        }
//
//
//        return head;
//
//
//
//
//    }
//
//
//}
//class Noode {
//      int val;
//      Noode next;
//      Noode() {}
//      Noode(int val) { this.val = val; }
//      Noode(int val, Noode next) { this.val = val; this.next = next; }
//  }
//
