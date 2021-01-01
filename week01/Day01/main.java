public class main {
    public static void main(String[]args){
//        int [] arr = {2,3,4};
//        twosum ts = new twosum();
////        ts.printArray(arr);
////
////        int[]res = ts.twoSu(arr,3);
////        if(ts.isfound){
////            ts.printArray(res);
////        }
////        else{
////            System.out.println("NONE");
////        }
//
//        int []result = ts.tsu(arr,7);
//        ts.printArray(result);
        addtwo ad = new addtwo();
//        ListNode n3 = new ListNode(9);
//        ListNode n1 = new ListNode(9);
//        ListNode n2 = new ListNode(9);
//        ListNode n11 = new ListNode(9);
//        ListNode n12 = new ListNode(9);
//        ListNode n13 = new ListNode(9);
//        ListNode n14 = new ListNode(9);

        ListNode n1 = new ListNode(2);
        ListNode n2 = new ListNode(4);
        ListNode n3 = new ListNode(9);

        n1.next = n2;
        n2.next = n3;
//        n3.next = n11;
//        n11.next = n12;
//        n12.next = n13;
//        n13.next = n14;



//        ListNode n4 = new ListNode(9);
//        ListNode n5 = new ListNode(9);
//        ListNode n6 = new ListNode(9);
//         ListNode n7 = new ListNode(9);

        ListNode n4 = new ListNode(5);
        ListNode n5 = new ListNode(6);
        ListNode n6 = new ListNode(4);
        ListNode n7 = new ListNode(9);

        n4.next = n5;
        n5.next = n6;
       n6.next = n7;
        ListNode res = ad.addTwwNum(n1,n4);
        ListNode current = res;
        while(current!=null){
            System.out.print(current.val + " ");
            current = current.next;
        }

    }
}
