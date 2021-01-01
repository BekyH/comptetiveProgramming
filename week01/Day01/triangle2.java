public class triangle2 {
    public static void main(String[] args){
        tri(7);
    }
    public static void tri(int y){
        for(int i = 1;i<=y;i=i+2){
            for(int j = 0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
