import java.io.*;
import java.util.*;
 


public class book{
   public static void main(String[] args) {
      MyScanner sc = new MyScanner();
      out = new PrintWriter(new BufferedOutputStream(System.out));
      int t = sc.nextInt();
      //HashMap<Integer,List<Integer>> hashmap = new HashMap<>();
      for(int i=0;i<t;i++){
        int n = sc.nextInt();
        HashMap<Integer,List<Integer>> hashmap = new HashMap<>();
      HashMap<Integer,Integer> indegree = new HashMap<>();
        
        for(int j=1;j<=n;j++){
            String str = sc.nextLine();
            String [] st = str.split(" ");
            indegree.put(j, Integer.parseInt(st[0]));
            
            for(int k=1;k<st.length;k++){
                int key = Integer.parseInt(st[k]);
                if(hashmap.containsKey(key)){
                    List<Integer> lst = hashmap.get(key);
                    lst.add(j);
                    hashmap.put(key, lst);
                }
                else{
                    List<Integer> lst = new ArrayList<>();
                    lst.add(j);
                    hashmap.put(key, lst);
                }
            }
            

        }
        int [] arr = new int[n];
        out.println(bfs(hashmap, indegree,arr));
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
    public static int bfs(HashMap<Integer,List<Integer>> hashmap,HashMap<Integer,Integer> indegree,int [] arr){
        int chapter = 0;
        Deque<Integer> deque = new ArrayDeque<>();
        for(Map.Entry<Integer,Integer> e:indegree.entrySet()){
            if(e.getValue()==0){
                deque.add(e.getKey());
                arr[e.getKey()-1] = 1;
            }
        }
        while(!deque.isEmpty()){
                int parent = deque.poll();
                chapter++;
                List<Integer> children = hashmap.get(parent);
                if(children!=null){
                    for(int child:children){
                        int val = indegree.get(child);
                        val = val - 1;
                        indegree.put(child, val);
                        int curr = arr[child-1];
                        curr = Math.max(arr[parent-1],curr);
                        if(val==0 && child<parent){
                            arr[child-1] = Math.max(arr[child-1],curr + 1);
                            deque.add(child);
                        }
                        else if(val==0){
                            arr[child-1] = Math.max(arr[child-1],curr);
                            deque.add(child);
                        }
                    }
                }
        }

        if(chapter<indegree.size()){
            return -1;
        }
        int max = 0;
        for(int i:arr){
            max = Math.max(max,i);
        }
        return max;
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