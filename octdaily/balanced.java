import.java.util.*;
public class balanced{
    
    public int balancedTeam(int n,int[] students){
        Stack<Integer> stack = new Stack<>();
        int max_diff = 5;
        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;
        for(int i:students){
            if(stack.isEmpty()){
                stack.add(students[i]);
                min = i;
                max = i;
            }
            else{
                int element = stack.peek();
                int diff = Math.abs(element-students[i]);
                int diff1 = Math.abs(max-students[i]);
                int diff2 = Math.abs(min-students[i]);
                if(diff<=max_diff && diff1<=max_diff && diff2<=max_diff){
                    stack.add(students[i]);
                    min = Math.min(students[i],min);
                    max = Math.max(max,students[i]);
                }
                else{
                    stack.pop();
                    stack.add(i);
                    min = students[i];
                    max = students[i];
                }
            }
        }
        return stack.size();
    }
}