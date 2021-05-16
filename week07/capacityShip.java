public class capacityShip {
    public int shipWithinDays(int[] weights, int D) {
        int sum = 0;
        int max = Integer.MIN_VALUE;
        int weight_capacity = 0;
        for (int i = 0; i < weights.length; i++) {
            max = Math.max(weights[i], max);
            sum = sum + weights[i];
        }
        int left = max;
        int right = sum;
        int mid = 0;
        while (left <= right) {
            mid = left + (right - left) / 2;

            if (isPossible(weights, D, mid)) {
                weight_capacity = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return weight_capacity;

    }

    public boolean isPossible(int[] weights, int D, int curr_weight) {
        int dayCount = 1;
        int sum = 0;
        for (int i = 0; i < weights.length; i++) {
            if ((sum + weights[i]) > curr_weight) {
                sum = 0;
                dayCount++;
            }
            sum = sum + weights[i];
        }
        if (dayCount <= D) {
            return true;
        }
        return false;
    }

}
