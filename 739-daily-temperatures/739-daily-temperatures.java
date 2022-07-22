class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<day> st = new Stack<>();
        int [] answer = new int[temperatures.length];
        for(int i=0;i<temperatures.length;i++){
            day d = new day(i,temperatures[i]);
           
            
            while(!st.isEmpty() && d.temp>st.peek().temp){
                answer[st.peek().index] = d.index-st.peek().index;
                st.pop();
            }
            st.push(d);
        }
        
        return answer;
    }
}

class day{
    int index;
    int temp;
    day(int index,int temp){
        this.index = index;
        this.temp = temp;
    }
    
}