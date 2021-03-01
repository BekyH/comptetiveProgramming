public class maxDepthParentheses {
    public int maxDepth(String s) {
        if(s.length()==1){
            return 0;
        }
        int counter = 0;
        int maxcounter = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                counter++;
            }
            else if(s.charAt(i)==')'){
                maxcounter = Math.max(maxcounter,counter);
                counter--;
            }
        }
        return maxcounter;

    }
}
