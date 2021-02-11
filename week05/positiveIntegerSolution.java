import java.util.ArrayList;
import java.util.List;

public class positiveIntegerSolution {
    public List<List<Integer>> findSolution(CustomFunction customfunction, int z) {
        List<List<Integer>> result = new ArrayList<>();

        for(int x = 1;x<=z+1;x++){
            int start = 1;
            int end = z;
            List<Integer> tempresult = new ArrayList<>();
            while(start<=end){
                int mid = (start + end)/2;
                int res = customfunction.f(x,mid);
                if(res==z){
                    tempresult.add(x);
                    tempresult.add(mid);
                    result.add(tempresult);
                    break;
                }
                else if(res<z){
                    start = mid + 1;
                }
                else{
                    end = mid-1;
                }
            }



        }

        return result;
    }

}
class CustomFunction {
      // Returns f(x, y) for any given positive integers x and y.
              // Note that f(x, y) is increasing with respect to both x and y.
              // i.e. f(x, y) < f(x + 1, y), f(x, y) < f(x, y + 1)
              public int f(int x, int y){
                  return 0;
              };
  };

