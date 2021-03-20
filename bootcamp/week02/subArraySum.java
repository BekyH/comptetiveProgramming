package com.company;

import java.util.HashMap;

public class subArraySum {
    //brute force (n^2)
    public int subarraySum(int[] nums, int k) {

        int counter = 0;
        for(int i=0;i<nums.length;i++){
            int sum = 0;
            for(int j = i;j<nums.length;j++){
                sum = sum + nums[j];
                if(sum==k){
                    counter++;
                }
            }
        }
        return counter;
    }
    //optimized 0(n)
    public int subarraySumO(int[] nums, int k) {
        int sum = 0;
        int counter = 0;
        HashMap<Integer,Integer> hashmap = new HashMap<>();
        hashmap.put(0,1);
        for(int num:nums){
            sum = sum + num;
            if(hashmap.containsKey(sum-k)){
                counter = counter + hashmap.get(sum-k);
            }
            hashmap.put(sum,hashmap.getOrDefault(sum,0) +1);

        }
        return counter;
    }
}
