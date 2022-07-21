class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        for(String str:tokens){
            switch(str){
                case "+":
                    int x = st.pop();
                    int y = st.pop();
                    int z= x+y;
                    st.push(z);
                    break;
                case "-":
                     int x1 = st.pop();
                    int y1 = st.pop();
                    int z1= y1-x1;
                    st.push(z1);
                    break;
                case "*":
                     int x2 = st.pop();
                    int y2 = st.pop();
                    int z2= x2*y2;
                    st.push(z2);
                    break;
                case "/":
                     int x3 = st.pop();
                    int y3 = st.pop();
                    int z3= y3/x3;
                    st.push(z3);
                    break;
                default:
                    int num = Integer.parseInt(str);
                    st.push(num);
                    break;
            }
        }
        return st.peek();
    }
}