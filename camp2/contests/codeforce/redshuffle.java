import java.io.*;
import java.math.BigInteger;
import java.util.*;
 
 
public class redshuffle{
   public static void main(String[] args) {
      MyScanner sc = new MyScanner();
      out = new PrintWriter(new BufferedOutputStream(System.out));
     // out.println("here");
      int t = sc.nextInt();
      
      for(int i=0;i<t;i++){
     int n = sc.nextInt();
        String R = sc.nextLine();
        String B = sc.nextLine();
         
        out.println(sum(R, B));

      }
      // Start writing your solution here. -------------------------------------
   
      /*
      int n      = sc.nextInt();        // read input as integer
      long k     = sc.nextLong();       // read input as long
      double d   = sc.nextDouble();     // read input as double
      String str = sc.next();           // read input as String
      String s   = sc.nextLine();       // read whole line as String

      int result = 3*n;
      out.println(result);                    // print via PrintWriter
      */

      // Stop writing your solution here. -------------------------------------
      out.close();
   }
   public static String sum(String num1,String num2){
       String winner="";
       int count1 = 0;
       int count2=0;
       for(int i=0;i<num1.length();i++){
            int a = (int)num1.charAt(i);
            int b = (int)num2.charAt(i);
            if(a>b){
                count1++;
            }
            else if(b>a){
                count2++;
            }
            else{
                count1++;
                count2++;
            }
       }
       if(count1>count2){
            winner = "RED";
       }
       else if(count1==count2){
        winner = "EQUAL";
       }
       else{
           winner = "BLUE";
       }
       return winner;
   }

     

   //-----------PrintWriter for faster output---------------------------------
   public static PrintWriter out;
      
   //-----------MyScanner class for faster input----------
   public static class MyScanner {
      BufferedReader br;
      StringTokenizer st;
 
      public MyScanner() {
         br = new BufferedReader(new InputStreamReader(System.in));
      }
 
      String next() {
          while (st == null || !st.hasMoreElements()) {
              try {
                  st = new StringTokenizer(br.readLine());
              } catch (IOException e) {
                  e.printStackTrace();
              }
          }
          return st.nextToken();
      }
 
      int nextInt() {
          return Integer.parseInt(next());
      }
 
      long nextLong() {
          return Long.parseLong(next());
      }
 
      double nextDouble() {
          return Double.parseDouble(next());
      }
 
      String nextLine(){
          String str = "";
    try {
       str = br.readLine();
    } catch (IOException e) {
       e.printStackTrace();
    }
    return str;
      }

   }
   //--------------------------------------------------------
}