
public class reorderList {
    public void reorderlist(ListNode head) {
        Deque<ListNode> deque = new ArrayDeque();
        ListNode current = head;
        while (current != null) {
            deque.add(current);
            current = current.next;
        }
        ListNode node = null;
        ListNode tail = null;
        while (deque.size() > 1) {
            node = deque.poll();
            tail = deque.pollLast();
            tail.next = null;
            node.next = tail;
            if (deque.size() > 0) {
                tail.next = deque.getFirst();
                deque.getFirst().next = null;

            }
        }
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
