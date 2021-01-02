public class Valley {
    int up=0;
    int down=0;
    int valley=0;
    int seaLevel=0;
    public  void countingValleys(String path){
        seaLevel=0;
        String[] patharr = path.split("");
        for(int i = 0;i<patharr.length;i++){
            if(patharr[i].equals("U")){
                seaLevel++;
            }
            else{
                seaLevel--;
            }

            if( seaLevel==0 && patharr[i].equals("U")){
               valley++;

            }
        }
        System.out.println(valley);




    }
    public static void main(String[] args){
        Valley valley = new Valley();
        valley.countingValleys("UDDDUDUU");
        
    }

}
