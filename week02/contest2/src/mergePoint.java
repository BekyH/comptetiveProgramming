import com.sun.scenario.effect.Merge;

import java.util.HashMap;
import java.util.Map;

public class mergePoint {

public static void main(String[] args){
    Node n1 = new Node(1);
    Node n2 = new Node(2);
    Node n3 = new Node(3);
    Node n4 = new Node(4);
    Node n5 = new Node(5);
    Node n6 = new Node(6);
    n5.next = n6;
    n1.next = n2;
    n2.next = n3;
    n3.next = n6;
    n4.next = n5;
    int p = Merge(n1,n4);
    int x = merge2(n1,n4);
    System.out.println(x);

    System.out.println(p);


}

    public static  int Merge(Node head1,Node head2){
        Node node1 = head1;
        Node node2 = head2;
        while(node1!=node2){
            if(node1.next==null){
                node1 = head2;
            }
            else{
                node1 = node1.next;
            }
            if(node2.next==null){
                node2 = head1;
            }
            else{
                node2 = node2.next;
            }

        }
        return node1.data;

    }
    // another approach 

    public static int merge2(Node head1,Node head2){
        HashMap<Node,Integer> hashMap = new HashMap<>();
        Node node1 = head1;
        Node node2 = head2;
        while(node1!=null){
            hashMap.put(node1,1);
            node1 = node1.next;
        }
        for(Map.Entry<Node,Integer> e:hashMap.entrySet()){
            while(node2!=null){
                if(hashMap.containsKey(node2)){
                    return node2.data;
                }
                node2 = node2.next;
            }
        }
        return 0;
    }

}
class Node {

    Node next;
    int data;


    public Node(int data) {
        this.data = data;
        this.next = null;

    }

}

