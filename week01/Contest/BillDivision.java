import com.sun.xml.internal.fastinfoset.util.CharArray;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class BillDivision {


    public static void biling(List<Integer> bill,int k,int b){
        for(int i = 0;i<bill.size();i++){
            if(bill.get(i)==bill.get(k)){
                    bill.remove(i);
            }
        }
        int total = 0;
        for(int j=0;j<bill.size();j++){
            total = total + bill.get(j);

        }
        int bactual = total/2;
        if(b-bactual==0){
            System.out.println("Bon Appetit");
        }
        else{
            System.out.println(b-bactual);
        }
    }
    public static void main(String[] args){
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(10);
        list.add(2);
        list.add(9);

//        biling(list,1,12);
//        for(int i:list){
//            System.out.println(i);
//        }
        int []arr={1,3,2,6,1,2};
       int y= divisble(6,3,arr);
       //System.out.println(y);
        repeatedString("aba",10);
    }
    public static int divisble(int n,int k,int[] ar){
        if(n>=2 && n<=100 && k>=1 && k<=100){
            int counter= 0;
            for(int i = 0;i<n;i++){
                if(ar[i]>=1 && ar[i]<=100) {
                    for (int j = 0; j < n; j++) {

                        if (i < j) {
                            if (((ar[i] + ar[j]) % k) == 1) {
                                counter++;
                            }
                        }

                    }
                }
            }
            return counter;
        }
        else{
            return 0;
        }

    }
    static long repeatedString(String str,int n) {
        int x = n/str.length();
        int y = n%str.length();
        int counter = 0;
        for(int i = 0;i<str.length();i++){
            if(str.charAt(i)=='a'){
                counter++;
            }
        }
        int total =  x *counter;
        for(int j = 0;j<y;j++){
            if(str.charAt(j)=='a'){
                total++;
            }
        }
        return total;
    }


}
