import jdk.internal.org.objectweb.asm.tree.LdcInsnNode;

import java.util.List;

public class middleNode {

    public static void main(String[] args){
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);
        ListNode n5 = new ListNode(5);
        ListNode n6 = new ListNode(6);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        middleNode midlle = new middleNode();

        ListNode mid =midlle.middleNode(n1);
        System.out.println(mid.val);


    }

    public ListNode middleNode(ListNode head) {
        ListNode n = head;
        if(head==null){
            return null;
        }
        int size = 0;
        int counter = 0;
        ListNode current = head;
        while(current!=null){
            size++;
            current = current.next;
        }
        int middle = (size/2) + 1;
        ListNode middlenode = null;
        current = head;
        while(current!=null){
            counter++;
            if(middle==counter){
                middlenode = current;
                break;

            }
            current = current.next;
        }
        return middlenode;

    }


}
 class ListNode {
      int val;
      ListNode next;
      ListNode() {}
           ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }


  }
