import java.util.Arrays;

public class anagram {
    public static void main(String[] args){
        boolean a = isAnagram("car","rac");
        System.out.print(a);
    }


    public static boolean isAnagram(String s, String t) {
        char [] sch = s.toCharArray();
        char [] tch = t.toCharArray();
        Arrays.sort(sch);
        Arrays.sort(tch);
        String ss = "";
        String tt = "";
        for(int i = 0;i<sch.length;i++){
            ss = ss + sch[i];
        }
       for(int j = 0;j<tch.length;j++){
           tt = tt + tch[j];
       }
        if(ss.equals(tt)){
            return true;
        }
        else{
            return false;
        }

    }

}
