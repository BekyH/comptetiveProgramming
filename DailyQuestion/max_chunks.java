public class max_chunks {
    public int maxChunksToSorted(int[] arr) {
        Set<Integer> set = new HashSet<>();
        int max_chunks = 0;

        for (int i = 0; i < arr.length; i++) {
            boolean found = true;
            for (int k = 0; k < i; k++) {
                if (!set.contains(k)) {
                    found = false;
                }
            }
            set.add(arr[i]);
            if (found) {
                max_chunks++;
            }
        }
        return max_chunks;
    }
}