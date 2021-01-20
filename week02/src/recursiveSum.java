import com.sun.xml.internal.ws.util.StringUtils;

import java.math.BigInteger;

public class recursiveSum {
    public static void main(String[] args){
       superDigit("9875",4);
       String s = "23";
       StringBuilder ss = new StringBuilder(s);


    }


    static void superDigit(String n, int k) {
        StringBuilder sb = new StringBuilder(k * n.length());
        long num = 0;
        for(int i = 0;i<n.length();i++){
            num = num + Integer.parseInt(n.charAt(i) +"");

        }
        num = num *k;




            String st = recursiveSum(String.valueOf(num));
            System.out.print(st);







    }
    static String recursiveSum(String s){
        if(s.length()==1){
            return s;
        }

        long sum = 0;
        long x = Long.parseLong(s);

        while(x!=0){

            long y = x %10;
            sum = sum + y;
            x = x/10;


        }
        String str = String.valueOf(sum);
        return recursiveSum(str);


    }



}
