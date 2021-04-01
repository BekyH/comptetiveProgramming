package com.company;

public class factorialTrailingZeros {
    public int trailingZeroes(int n) {
        if(n<5){
            return 0;
        }
        int result = 0;
        for(int i=5;i<=n;i=i*5){
            result =result + n/i;
        }

        return result;
    }
}
