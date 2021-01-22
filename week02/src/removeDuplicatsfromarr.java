import java.util.*;

public class removeDuplicatsfromarr {

    public static void main(String[] args) {
        int[] nums = {0,0,0,1,1,1,2,2,3,3,4};
        removeDuplicates(nums);
    }

    public static void removeDuplicates(int[] nums) {
        Stack<Integer> st = new Stack<>();
        for(int i = 0;i<nums.length;i++){
            if(st.empty()){
                st.push(nums[i]);
            }
            else{
                if(nums[i]==st.peek()){

                }
                else{
                    st.push(nums[i]);
                }
            }
        }
        int[] num = new int[st.size()];
        for(int x=0;x<st.size();x++){
            num[x] = st.get(x);



        }
        for(int y:st){
            System.out.print(y + " ");
        }




    }
}
