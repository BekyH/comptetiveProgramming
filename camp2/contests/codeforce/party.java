import java.io.*;
import java.util.*;

import javax.print.event.PrintEvent;
 
 
public class party{
   public static void main(String[] args) {
      MyScanner sc = new MyScanner();
      out = new PrintWriter(new BufferedOutputStream(System.out));
      int n = sc.nextInt();
      HashMap<Integer,Integer> indegree = new HashMap<>();
      HashMap<Integer,List<Integer>> hashmap = new HashMap<>();
      int [] parents = new int[n];
      //stem.out.println(n);
      for(int j=0;j<n;j++){
        parents[j] = sc.nextInt();
      }
      for(int i=0;i<n;i++){
         if(hashmap.containsKey(parents[i])){
            List<Integer> ls = hashmap.get(parents[i]);
            ls.add(i+1);
            hashmap.put(parents[i],ls);
         }
         else if(parents[i]!=-1){
            List<Integer> ls = new ArrayList<>();
            ls.add(i+1);    
            hashmap.put(parents[i],ls); 
         }
         if(parents[i]==-1){
             indegree.put(i+1,0);

         }
         else{
            indegree.put(i+1,1);  
         }
      }
    //   for(Map.Entry<Integer,List<Integer>> e:hashmap.entrySet()){
    //     out.println(e.getKey() + ":" + e.getValue());
    //   }
    Deque<Integer> deque = new ArrayDeque<>();
      for(Map.Entry<Integer,Integer> e:indegree.entrySet()){
        if(e.getValue()==0){
            deque.add(e.getKey());
        }
      }
      int total = 0;
      while(!deque.isEmpty()){
            int size = deque.size();
            for(int i=0;i<size;i++){
                int parent = deque.poll();
                List<Integer> children = hashmap.get(parent);
                if(children!=null){
                    for(int child:children){
                        int val = indegree.get(child);
                        val = val-1;
                        deque.add(child);
                    }
                }
            }
            total++;
      }
      out.println(total);
      
      

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