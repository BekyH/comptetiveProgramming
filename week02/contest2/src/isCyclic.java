import java.util.HashMap;

public class isCyclic {

    public boolean hasCycle(ListNode head){
        ListNode n = head;
        HashMap<ListNode,Integer> hashMap= new HashMap<>();
        while(n!=null){
            if(hashMap.containsKey(n)){
                return true;
            }
            hashMap.put(n,1);
            n = n.next;
        }
        return false;

    }
}
class ListNode{
    int data;
    ListNode next;
    public ListNode(int data){
        this.data = data;
    }


}

