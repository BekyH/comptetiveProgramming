package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class icecream {

    static int[] icecreamParlor(int m, int[] arr) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        int[] res = new int[2];
        for(int x:arr){
            arrayList.add(x);
        }

        for(int i = 0;i<arrayList.size();i++){
            int x = m-arrayList.get(i);
            int a =arrayList.indexOf(x);
            if(a==i){
                continue;
            }
           else if(a!=-1){
                res[0] = i+1;
                res[1] = a +1;
                break;
            }
            else{

            }

        }
        Arrays.sort(res);

        return res;


    }


}
