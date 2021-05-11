public class noOfRectangles {

    public int countGoodRectangles(int[][] rectangles) {
        List<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> hashmap = new HashMap<>();
        int num_rect = 0;

        for (int[] rect : rectangles) {
            list.add(Math.min(rect[0], rect[1]));
        }

        int max_len = Collections.max(list);

        for (int x : list) {
            if (hashmap.containsKey(x)) {
                int val = hashmap.get(x);
                val = val + 1;
                hashmap.put(x, val);
            } else {
                hashmap.put(x, 1);
            }
        }

        num_rect = hashmap.get(max_len);
        return num_rect;
    }
}
