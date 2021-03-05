class MyLinkedList {
    Node head;
    int size;


    /** Initialize your data structure here. */
    public MyLinkedList() {
        head = null;
        size = 0;
    }

    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    public int get(int index) {
        if(head==null){
            return -1;
        }
        if(index<0 || index>=size){
            return -1;
        }
        Node current = head;
        for(int i = 0;i<index;i++){
            current = current.next;
        }
        return current.val;

    }

    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    public void addAtHead(int val) {

        Node newHead = new Node(val);
        newHead.next = head;
        head = newHead;
        size++;

    }

    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {
        if(head==null){
            head = new Node(val);
        }
        else{
            Node current = head;
            while(current.next!=null){
                current = current.next;
            }
            Node tail = new Node(val);
            current.next = tail;

        }
        size++;

    }

    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
    public void addAtIndex(int index, int val) {
        if(index<0 || index>size){
            return;
        }
        if(index==0){
            addAtHead(val);
            return;
        }
        else{
            Node current = head;
            for(int i = 0;i<index-1;i++){
                current = current.next;
            }
            Node newNode = new Node(val);
            newNode.next = current.next;
            current.next = newNode;

        }
        size++;

    }

    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {
        if(index<0 && index>=size){
            return;
        }
        else if(index==0){
            Node current = head.next;
            head.next = null;
            head = current;
            size--;
        }
        else{
            Node current = head;
            for(int i = 0;i<index-1;i++){
                current = current.next;
            }
            if(current==null || current.next==null){
                return;
            }
            current.next = current.next.next;
            size--;
        }

    }
}
class Node{
    int val;
    Node next;

    public Node(int val){
        this.val = val;

    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */
