public class minimumOPerationstomakeArrayEqual {
    public int minOperations(int n) {
        if (n == 1) {
            return 0;
        }
        int equalValue = 0;
        int num_operations = 0;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = (2 * i) + 1;

        }
        if (n % 2 == 0) {
            int m = (n - 1) / 2;
            int l = n / 2;
            equalValue = (arr[m] + arr[l]) / 2;

        } else {
            int m = n / 2;
            equalValue = arr[m];
        }

        for (int i = 0; i < n; i++) {
            int diff = Math.abs(arr[i] - equalValue);
            num_operations = num_operations + diff;
        }
        num_operations = num_operations / 2;
        return num_operations;
    }
}
