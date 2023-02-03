class Solution {
    public String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
        String[] arr = path.split("/");
        StringBuilder sb = new StringBuilder();
        // for(String str:arr){
        //     System.out.println(str);
        // }
        for(String word:arr){
            if(word.equals("..")){
                if(!stack.isEmpty()){
                    stack.pop();
                }
            }
            else if(word.equals(".") || word.equals("")){
                
            }
            else{
                stack.push(word);
            }
        }
        
        if(stack.isEmpty()){
            sb.append("/");
        }
        for (String str:stack){
            sb.append("/");
            sb.append(str);
        }
        
        return sb.toString();
    }
}