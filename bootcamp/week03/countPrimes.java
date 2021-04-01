package com.company;

import java.util.Arrays;

public class countPrimes {
    public int countPrimes(int n) {
        if(n==0 || n==1){
            return 0;
        }
        boolean [] primes = new boolean[n+1];
        int counter=0;
        Arrays.fill(primes,true);
        primes[0] = false;
        primes[1] = false;
        int sqrt = (int)Math.sqrt(n);
        for(int i=2;i<=sqrt;i++){
            if(primes[i]){
                for(int k = i*i;k<=n;k+=i){
                    primes[k]=false;
                }
            }
        }
        for(int i=2;i<n;i++){
            if(primes[i]){
                counter++;
            }
        }
        return counter;
    }
}
