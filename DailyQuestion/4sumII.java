public class sumII {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        int n = nums1.length;
        HashMap<Integer, Integer> hashmap = new HashMap<>();
        int counter = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int sum = nums1[i] + nums2[j];
                if (hashmap.containsKey(sum)) {
                    int val = hashmap.get(sum);
                    val = val + 1;
                    hashmap.put(sum, val);
                } else {
                    hashmap.put(sum, 1);
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int sum = -(nums3[i] + nums4[j]);
                if (hashmap.containsKey(sum)) {
                    int val = hashmap.get(sum);
                    counter = counter + val;
                }
            }
        }
        return counter;
    }

}
