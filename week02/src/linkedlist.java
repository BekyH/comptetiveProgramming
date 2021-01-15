public class linkedlist {
    Node head;
    public void appendatTail(int data){
        if (head == null) {
            head = new Node(data);
            return;
        }
       // Node Newnode =new Node(data);
        Node n = head;
        while(n.next!=null){
            n = n.next;
        }
        Node newnode = new Node(data);
        n.next = newnode;



    }
    public void appendatHead(int data){
        Node newHead = new Node(data);


            newHead.next = head;
            head = newHead;







    }

    public int getSize(){
        Node n = head;
        int counter = 0;
        if(n==null){
            return 0;

        }
        while(n!=null){
            counter++;
            n = n.next;
        }
        return counter;

    }
    public void printList(){
        Node n = head;
        while(n!=null){
            System.out.print(n.data + " ");
            n = n.next;
        }
        System.out.println();
    }
    public void deleteNode(int data){
        if(head==null){
            return;
        }
        if(head.data==data){
            head = head.next;
            return;
        }
        Node current = head;
        while(current.next!=null){
            if(current.next.data ==data){
                current.next = current.next.next;
            }
            current =current.next;
        }

    }


    public static void main(String[] args){

        linkedlist ll = new linkedlist();






        ll.appendatTail(1);

        ll.appendatTail(2);
        ll.appendatTail(3);

        ll.printList();
        ll.appendatHead(4);

        ll.printList();
        ll.appendatTail(5);
        ll.printList();
        ll.deleteNode(4);
        ll.deleteNode(1);
        ll.printList();

       // System.out.print(ll.getSize());


    }



}
class Node{

    Node next;
    int data;
    public Node(int data){
        this.data = data;

    }


}
