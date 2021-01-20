import com.sun.xml.internal.ws.util.StringUtils;

import java.math.BigInteger;
import java.util.Queue;

public class recursiveSum {
    public static void main(String[] args){
       int x =superDigit("9875",4);
       System.out.println(x);



    }


    static int superDigit(String n, int k) {

            if(n.length()==1 && k==1){
                return Integer.parseInt(n);
            }
            long num = 0;
            for(int i = 0;i<n.length();i++){
                num = num + Integer.parseInt(n.charAt(i) +"");

            }
            num = num *k;
            return superDigit(String.valueOf(num),1);

        }







    }
//    static String recursiveSum(String s){
//
//        if(s.length()==1){
//            return s;
//        }
//
//        long sum = 0;
//        long x = Long.parseLong(s);
//
//        while(x!=0){
//
//            long y = x %10;
//            sum = sum + y;
//            x = x/10;
//
//
//        }
//        String str = String.valueOf(sum);
//        return recursiveSum(str);
//
//
//    }




