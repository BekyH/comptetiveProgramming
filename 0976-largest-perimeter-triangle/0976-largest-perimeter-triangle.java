class Solution {
    public int largestPerimeter(int[] a) {
          int sum = 0;


        Arrays.sort(a);

        for(int j = a.length - 1;j>=0;j--){
            if (j - 2 >=0) {
                if ((a[j-2] + a[j - 1]) > (a[j])) {
                    sum = a[j] + a[j - 1] + a[j - 2];
                    return sum;
                }

            }
            
        }

        return 0;
    }
}