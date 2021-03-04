//import java.util.ArrayList;
//
//public class linkedlist {
//    Node head;
//    public void appendatTail(int data){
//        if (head == null) {
//            head = new Node(data);
//            return;
//        }
//       // Node Newnode =new Node(data);
//        Node n = head;
//        while(n.next!=null){
//            n = n.next;
//        }
//        Node newnode = new Node(data);
//        n.next = newnode;
//
//
//
//    }
//    public void appendatHead(int data){
//        Node newHead = new Node(data);
//
//
//            newHead.next = head;
//            head = newHead;
//
//
//
//
//
//
//
//    }
//
//    public void reverse() {
//        Node n = head;
//
//        if (head == null) {
//            return;
//        }
//        Node current = head;
//        Node prev = null;
//        Node nex;
//        while (current != null) {
//            nex = current.next;
//            current.next = prev;
//            prev = current;
//            current = nex;
//
//
//
//        }
//        head = prev;
//
//    }
//    public void palindromeCheck(linkedlist ll){
//        Node n = head;
//        String str = "";
//        while(n!=null){
//            str = str+n.data;
//            n = n.next;
//        }
//
//        ll.reverse();
//        String str2 ="";
//        Node n2 = head;
//        while(n2!=null){
//            str2 = str2 + n2.data;
//            n2 = n2.next;
//
//        }
//        if(str.equals(str2)){
//            System.out.println("palindrome");
//        }
//        else{
//            System.out.println("Not palindrome");
//        }
//
//
//    }
//
//
//
//
//    public int getSize(){
//        Node n = head;
//        int counter = 0;
//        if(n==null){
//            return 0;
//
//        }
//        while(n!=null){
//            counter++;
//            n = n.next;
//        }
//        return counter;
//
//    }
//    public void printList(){
//        Node n = head;
//        while(n!=null){
//            System.out.print(n.data + " ");
//            n = n.next;
//        }
//        System.out.println();
//    }
//    public void deleteNode(int data){
//        if(head==null){
//            return;
//        }
//        if(head.data==data){
//            head = head.next;
//            return;
//        }
//        Node current = head;
//        while(current.next!=null){
//            if(current.next.data ==data){
//                current.next = current.next.next;
//            }
//            current =current.next;
//        }
//
//    }
//
//
//    public static void main(String[] args){
//
//        linkedlist ll = new linkedlist();
//
//
//
//
//
//
//        ll.appendatTail(3);
//
//        ll.appendatTail(2);
//        ll.appendatTail(3);
//        ll.appendatHead(1);
//        ll.appendatTail(2);
//
//        ll.printList();
//        ll.palindromeCheck(ll);
////        ll.appendatHead(4);
////
////        ll.printList();
////        ll.appendatTail(5);
////        ll.printList();
//       // ll.deleteNode(4);
//        //ll.deleteNode(1);
////        ll.printList();
////        ll.reverse();
////        ll.printList();
////        ll.appendatHead(4);
////        ll.printList();
////        ll.reverse();
////        ll.printList();
////        ll.appendatTail(7);
////        ll.printList();
////        ll.reverse();
////        ll.printList();
//
//       // System.out.print(ll.getSize());
//
//
//    }
//
//
//
//}
//class Node{
//
//    Node next;
//    int data;
//    public Node(int data){
//        this.data = data;
//
//    }
//
//
//}
