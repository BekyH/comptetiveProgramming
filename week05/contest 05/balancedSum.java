import java.util.List;

public class balancedSum {
    // Complete the balancedSums function below.
    static String balancedSums(List<Integer> arr) {
        // first we need left sum and right sum initalized to zero
        // we need left and right pointers starting from the first and last element respectively.
        if(arr.size()==1){
            return "YES";
        }
        int left = 0;
        int right = arr.size()-1;
        int left_sum = arr.get(left);
        int right_sum = arr.get(right);
        while(left<right){
            if(left_sum<=right_sum){
                left++;
                if(left<arr.size()){
                    left_sum = left_sum + arr.get(left);
                }

            }
            else{
                right--;
                if(right>=0){
                    right_sum = right_sum + arr.get(right);
                }
            }
        }
        if(left_sum ==right_sum){
            return "YES";
        }
        return "NO";


    }


}
