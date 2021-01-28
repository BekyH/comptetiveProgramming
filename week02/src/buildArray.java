import javax.print.attribute.HashAttributeSet;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class buildArray {
    public List<String> buildArray(int[] target, int n) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for(int x:target){
            arrayList.add(x);
        }
        List<String> res = new ArrayList<>();


        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for(int i = 0;i<target.length;i++){
            hashMap.put(target[i],1);

        }

        for(int j = 1;j<=n;j++){
            if(arrayList.size()>0){
                if(hashMap.containsKey(j)){
                    res.add("Push");
                    arrayList.remove(0);
                }
                else{
                    res.add("Push");
                    res.add("Pop");
                }
            }

        }
        return res;

    }
}
