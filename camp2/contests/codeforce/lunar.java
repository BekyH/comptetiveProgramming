import java.io.*;
import java.util.*;

import javax.print.attribute.HashAttributeSet;
 
 
public class lunar{
   public static void main(String[] args) {
      MyScanner sc = new MyScanner();
      out = new PrintWriter(new BufferedOutputStream(System.out));
      int n = sc.nextInt();
      int m = sc.nextInt();
      HashMap<Integer,List<Integer>> hashMap = new HashMap<>();
      List<Integer> res = new ArrayList<>();
      int [] r = new int[n];
      int index=0;
      PriorityQueue<Integer> minheap = new PriorityQueue<>();
      Set<Integer> visited = new HashSet<>();
      List<List<Integer>> edges = new ArrayList<>();
      for(int i=0;i<m;i++){
        int e1 = sc.nextInt();
        int e2 = sc.nextInt();
        
        if(hashMap.containsKey(e1)){
            List<Integer> ls = hashMap.get(e1);
            ls.add(e2);
            hashMap.put(e1,ls);
        }
        if(!hashMap.containsKey(e1)) {
            List<Integer> lt = new ArrayList<>();
            lt.add(e2);
            hashMap.put(e1, lt);
        }
        if(hashMap.containsKey(e2)){
            List<Integer> ls = hashMap.get(e2);
            ls.add(e1);
            hashMap.put(e2,ls);
        }
         if(!hashMap.containsKey(e2)){
            List<Integer> lt = new ArrayList<>();
            lt.add(e1);
            hashMap.put(e2, lt); 
        }   
      }
        minheap.add(1);
        visited.add(1);
      
      
      while(!minheap.isEmpty()){
            int node = minheap.poll();
            
              r[index++] = node;
               
            
            List<Integer> lst = hashMap.get(node);

            if(lst==null){
                continue;
            }
            for(int child:lst){

                if(!visited.contains(child)){
                    minheap.add(child);
                    visited.add(child);
                }
                
            }


      }
      for(int x:r){
        out.print(x + " ");
      }
      out.println();
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