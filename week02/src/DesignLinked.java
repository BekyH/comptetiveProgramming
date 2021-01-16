import sun.security.krb5.internal.crypto.Des;

public class DesignLinked {
    Node head;
public static void main(String[] args){
    DesignLinked dl = new DesignLinked();
    dl.addAtHead(3);
    dl.addAtHead(4);
    dl.addAtHead(5);
    dl.addAtTail(1);
    dl.printList();
    System.out.println(dl.get(1));
    dl.addAtIndex(3,9);
    dl.printList();
    dl.deleteAtIndex(4);
    dl.printList();



}
    public void printList(){
        Node n = head;
        while(n!=null){
            System.out.print(n.data + " ");
            n = n.next;
        }
        System.out.println();
    }
    public int get(int index) {
        Node n = head;
        int size = 0;
        if(n==null){
            return 0;

        }
        while(n!=null){
            size++;
            n = n.next;
        }
        if(index>=size){
            return -1;
        }
        int indexValue = 0;
        int counter = -1;
        Node current = head;
        while(current!=null){
            counter++;
            if(counter==index){
                indexValue = current.data;
                break;


            }
            current = current.next;

        }
        return indexValue;



    }

    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    public void addAtHead(int val) {
        Node newHead = new Node(val);


        newHead.next = head;
        head = newHead;


    }

    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {
        if (head == null) {
            head = new Node(val);
            return;
        }
        // Node Newnode =new Node(data);
        Node n = head;
        while(n.next!=null){
            n = n.next;
        }
        Node newnode = new Node(val);
        n.next = newnode;

    }

    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
    public void addAtIndex(int index, int val) {
        Node n = head;
        int size = 0;
        if(n==null){
            return;

        }
        while(n!=null){
            size++;
            n = n.next;
        }
        if(index>=size || index<0){
            return;
        }
        if(index==0){
            addAtHead(val);
            return;
        }
        int counter = 0;
        Node current = head;
        Node prev = null;
        Node nex;
        while(current!=null){

            counter++;
            if(counter==index){
                Node N = new Node(val);
                N.next = current.next;
                current.next = N;
//                System.out.println();
//                System.out.println(prev.data);
//                System.out.println(current.data);


                break;
            }
            current = current.next;

        }



    }

    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {
        Node current = head;
        int size=0;
        if(current==null){
            return;
        }
        while(current!=null){
            size++;
            current = current.next;
        }
        if(index>=size){
            return;
        }
        current = head;
        if(index==0){
            head = current.next;
            return;
        }
        current = head;
        Node nex;
        Node prev;
        int counter = 0;
        while(current!=null){

            counter++;
            if(index==counter){
                current.next = current.next.next;




            }
            current = current.next;
        }



    }
}

class Node {

    Node next;
    int data;

    public Node(int data) {
        this.data = data;

    }
}
