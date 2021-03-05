public class palindromeLinked {

    boolean node_result;

    public boolean isPalindrome(ListNode head) {
        if (head == null) {
            return true;
        }
        ListNode tail = head;
        return checker(head, tail);


    }

    public boolean checker(ListNode head, ListNode tail) {
        if (tail.next != null) {
            return (tail.val == head.val);

        }
        node_result = checker(head, tail.next);
        head = head.next;
        return (node_result && tail.val == head.val);

    }
}
//class ListNode {
//    int val;
//    ListNode next;
//    ListNode() {}
//    ListNode(int val) { this.val = val; }
//    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//}
