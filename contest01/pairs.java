public class pairs {
    public static int pairs(int k, List<Integer> arr) {
        // Write your code here
        Set<Integer> set = new HashSet<>();
        int counter = 0;
        for (int x : arr) {
            set.add(x);
        }
        for (int x : arr) {
            int y = x + k;
            if (set.contains(y)) {
                counter++;
            }
        }
        return counter;
    }
}