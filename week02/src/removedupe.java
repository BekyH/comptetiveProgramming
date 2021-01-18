import java.util.*;

public class removedupe {
    public static void main(String[] args){
        String s = "abbaca";
       String ss= removeDuplicates(s);
       System.out.print(ss);
    }

            public static  String removeDuplicates(String S) {

                Stack<Character> st = new Stack<>();
                for(int i = 0;i<S.length();i++){
                    if(st.empty()){
                        st.push(S.charAt(i));
                    }
                    else{
                        if(st.peek()==S.charAt(i)){
                            st.pop();
                        }
                        else{
                            st.push(S.charAt(i));
                        }
                    }
                }
                String str = "";
                while(!st.empty()){
                    str = str + st.pop();
                }
                StringBuilder sb = new StringBuilder(str);
                sb.reverse();
                return sb.toString();


    }
}
