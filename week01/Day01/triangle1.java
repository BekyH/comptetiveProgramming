public class triangle1 {

    public static void main(String[] args){
        patt(5);
    }

    public static void patt(int x){
            for(int i = 0;i<=x;i++){
                for(int j = 0;j<i;j++){
                    System.out.print("*");
                }
                System.out.println();
            }
    }
}
