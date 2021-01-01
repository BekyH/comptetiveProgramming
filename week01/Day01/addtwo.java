import java.math.BigInteger;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class addtwo {


    public ListNode addTwwNum(ListNode l1, ListNode l2) {

try {
    String str1 = "";
    String str2 = "";
    ListNode current1 = l1;
    while (current1 != null) {
        str1 = str1 + current1.val;

        current1 = current1.next;
    }

    ListNode current2 = l2;
    while (current2 != null) {
        str2 = str2 + current2.val;
        current2 = current2.next;
    }
    StringBuilder sr = new StringBuilder(str1);
    sr.reverse();
    String str11 = sr.toString();
    StringBuilder sr2 = new StringBuilder(str2);
    sr2.reverse();
    String str22 = sr2.toString();
    BigInteger a;
    BigInteger b;
    if (str11.length() >= str22.length()) {
         a = new BigInteger(str11);
        b = new BigInteger(str22);

    } else {
        a = new BigInteger(str22);
         b = new BigInteger(str11);
    }

    System.out.println(a);
    System.out.println(b);
    BigInteger sum = a.add(b);
    String s = String.valueOf(sum);
    StringBuilder sb = new StringBuilder(s);
    sb.reverse();


    String st = sb.toString();
    String[] starr = st.split("");
    ListNode succ = null;
    ListNode n = null;
    for (int x = starr.length - 1; x >= 0; x--) {
        n = new ListNode((Integer.parseInt(starr[x])), succ);
        succ = n;
    }
    return n;
}
catch(Exception e){
    return null;
}


    }
}

class ListNode{
    int val;
    ListNode next;
    ListNode(){

    }
    ListNode(int val) {
        this.val = val;
    }
        ListNode(int val,ListNode next){
            this.val = val;
            this.next = next;

    }
}
