class sherlock {

    /*
     * Complete the 'decentNumber' function below.
     *
     * The function accepts INTEGER n as parameter.
     */

    public static void decentNumber(int n) {
    // Write your code here
        int fives = n/3;
        int threes = n%3;
        String fv = "555";
        String thr = "3";
        while(fives>=0){
            if(threes%5==0){
               // System.out.println(fives + ":" + threes);
                System.out.println(fv.repeat(fives) + thr.repeat(threes));
                return;
            }
            fives = fives-1;
            threes = threes +3;
        }
        System.out.println(-1);
    }

}
