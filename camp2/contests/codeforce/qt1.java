import java.io.*;
import java.util.*;
 
 
public class qt1{
   public static void main(String[] args) {
      MyScanner sc = new MyScanner();
      out = new PrintWriter(new BufferedOutputStream(System.out));
      int n = sc.nextInt();
      HashMap<String,String> hashmap = new HashMap<>();
      HashMap<String,Integer> indegree = new HashMap<>();
      for(int i=0;i<n;i++){
        String st1 = sc.next();
        String st2 = sc.next();
        hashmap.put(st1,st2);
        if(indegree.containsKey(st2)){
            int val = indegree.get(st2);
            val = val + 1;
            indegree.put(st2,val);
        }
        else{
            indegree.put(st2, 1);
        }
    }
        HashMap<String,String> ans = new HashMap<>();
        Set<String> visited = new HashSet<>();
        for(Map.Entry<String,String> e:hashmap.entrySet()){
                  
                    if(!indegree.containsKey(e.getKey()) && !visited.contains(e.getKey())){
                       // visited.add(e.getKey());
                    
                    String child = hashmap.get(e.getValue());
                    if(child==null){
                        ans.put(e.getKey(),e.getValue());
                    }
                    else{
                    while(hashmap.get(child)!=null){
                            child = hashmap.get(child);
                    }
                                            ans.put(e.getKey(), child);
                    
                }
                }
                else{
                    continue;
                }

                    

        }
        out.println(ans.size());
        for(Map.Entry<String,String> e:ans.entrySet()){
            out.println(e.getKey() + " " + e.getValue());
                  
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