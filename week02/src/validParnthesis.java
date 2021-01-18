import java.util.ArrayList;
import java.util.Stack;

public class validParnthesis {
    public static void main(String[] args){
        String s = "([[]])";
        System.out.println(isValid(s));

    }

    public static boolean isValid(String s){
        Stack<Character> st = new Stack<>();

        for(int i = 0;i<s.length();i++){
            if(s.charAt(i)=='('|| s.charAt(i)=='{' || s.charAt(i)=='['){
                st.push(s.charAt(i));

            }
            else {
                if (st.empty()) {

                    return false;
                }

                if (s.charAt(i) == ')' || s.charAt(i) == '}'|| s.charAt(i) == ']') {
                    if (!st.empty()) {
                        if ((s.charAt(i) == ')' && st.peek() == '(' )||(s.charAt(i) == '}'
                                && st.peek() == '{')||(s.charAt(i) == ']' && st.peek() == '['))  {
                            st.pop();
                        }

                        else {
                            return false;
                        }
                    }

                }
            }


        }
        if(st.empty()){

            return true;


        }
        else{
            return false;
        }
    }

}

