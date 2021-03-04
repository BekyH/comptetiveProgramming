public class factori {

    public static void main(String[] args){}
    static int factorial(int n) {
        if(n==0 || n ==1) {
            return 1;
        }

            return n * factorial(n-1);
        }


    }

