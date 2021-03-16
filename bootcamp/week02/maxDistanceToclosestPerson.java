package com.company;

public class maxDistanceToclosestPerson {
    public int maxDistToClosest(int[] seats) {
        int left = 0;
        int right = 0;
        int distance = 0;
        int maxDistance = 0;

        while(right<seats.length){
            if(seats[right]==1){
                distance = right-left;
                if(distance>1 && seats[left]==1){
                    distance = distance/2;
                }
                left = right;
            }
            else if(seats[right]==0 && right==seats.length-1){
                distance = right-left;
            }

            maxDistance = Math.max(distance,maxDistance);
            right++;
        }
        return maxDistance;
    }
}
