package com.company;

public class prefectNumber {
    public boolean checkPerfectNumber(int num) {
        int res = 0;
        for(int i=1;i<=(int)Math.sqrt(num);i++){
            if(num%i==0 && i!=num){
                res = res+i;


                int d = num/i;

                if(d<num){
                    res = res+d;
                }
            }
        }
        if(res==num){
            return true;
        }

        return false;
    }
}
