public class User {
    public int[] findingUsersActiveMinutes(int[][] logs, int k) {
        HashMap<Integer, Set<Integer>> hashmap = new HashMap<>();
        int[] result = new int[k];
        for (int[] log : logs) {
            if (hashmap.containsKey(log[0])) {
                Set<Integer> set = hashmap.get(log[0]);
                set.add(log[1]);
                hashmap.put(log[0], set);

            } else {
                Set<Integer> set = new HashSet<>();
                set.add(log[1]);
                hashmap.put(log[0], set);
            }
        }
        for (Map.Entry<Integer, Set<Integer>> e : hashmap.entrySet()) {
            int activemin = e.getValue().size();
            result[activemin - 1] = result[activemin - 1] + 1;
        }

        return result;
    }
}