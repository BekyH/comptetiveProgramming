import java.util.Arrays;

public class largestPerimeter {
    public static void main(String[] args) {
        int[] arr = {3,6,2,3};
        int[] a = {3, 2, 3, 4};
        System.out.println(largestTri(arr));
    }


    public static int largestTri(int[] a) {
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
