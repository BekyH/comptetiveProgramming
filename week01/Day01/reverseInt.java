public class reverseInt {
    public static void main(String[] args){
        int reversed = reverse(1534236469);
        System.out.println(reversed);
    }


    public static int reverse(int x){
        try {


            String str = String.valueOf(x);
            if (str.charAt(0) == '-') {

                StringBuilder sb = new StringBuilder(str.substring(1));
                sb.reverse();
                String st = sb.toString();
                String strr = "-" + st;
                int y = Integer.parseInt(strr);
                return y;
            } else {
                StringBuilder sb = new StringBuilder(str);
                sb.reverse();
                String st = sb.toString();
                int y = Integer.parseInt(st);
                return y;
            }
        }
        catch (Exception e){
            return 0;
        }

    }

}


