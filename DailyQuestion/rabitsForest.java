import java.util.*;
public class rabitsForest {
    public int numRabbits(int[] answers) {

        HashMap<Integer, Integer> hashmap = new HashMap<>();
        for (int i = 0; i < answers.length; i++) {
            if (hashmap.containsKey(answers[i])) {
                int val = hashmap.get(answers[i]);
                val = val + 1;
                hashmap.put(answers[i], val);
            } else {
                hashmap.put(answers[i], 1);
            }
        }
        int result = 0;

        for (Map.Entry<Integer, Integer> e : hashmap.entrySet()) {
            int num = e.getKey();
            int freq = e.getValue();
            if (num == 0) {
                result = result + freq;
            } else if (num == 1) {
                if (freq % 2 == 0) {
                    result = result + freq;
                } else {
                    result = result + freq + 1;
                }
            } else if (num >= (freq - 1)) {
                result = result + 1 + num;
            } else {
                if (freq % 2 == 0) {
                    freq = freq - 1;
                }
                int div = freq / (num + 1);
                int mod = freq % num;
                int mod_sum = 0;
                if (mod > 0) {
                    mod_sum = 1 + num;

                }
                result = result + (1 + num) * div + mod_sum;
            }

        }
        return result;

    }
}
