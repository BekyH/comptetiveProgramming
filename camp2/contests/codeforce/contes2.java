import java.io.*;
import java.util.*;
 
 
public class contes2{
   public static void main(String[] args) {
      MyScanner sc = new MyScanner();
      out = new PrintWriter(new BufferedOutputStream(System.out));
      HashMap<String,List<String>> hashmap = new HashMap<>();
      Deque<String> deque = new ArrayDeque<>();
        int n = sc.nextInt();
       for(int i=0;i<n;i++){
        String str = sc.nextLine();
        String [] st = str.split(" ");
        String parent = st[2].trim().toLowerCase();
        String child = st[0].trim().toLowerCase();
        if(hashmap.containsKey(parent)){
            
            List<String> lst = hashmap.get(parent);
            lst.add(child);
            hashmap.put(parent,lst);
        }
        else{
            List<String> ls = new ArrayList<>();
            ls.add(child);
            hashmap.put(parent,ls);


        }
        
        
       } 
    
       deque.add("polycarp");
       int counter=0;
       
       while(!deque.isEmpty()){
           int size = deque.size();
           for(int i=0;i<size;i++){

           
            String str = deque.poll();
            
            
            List<String> children = hashmap.get(str);
            if(children!=null){
                for(String child:children){
                    
                        deque.add(child);
                    
                }
            }
        }
        counter++;
        
            
            
       }
      
       out.println(counter);
      
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