class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        for(int i=0;i<flowerbed.length;i++){
            if(flowerbed[i]==0){
                if((i==0 || flowerbed[i-1]==0) && (i==flowerbed.length-1 || flowerbed[i+1]==0)){
                    flowerbed[i]=1;
                    n = n-1;
                }
            }
        }
        
        return n>0? false:true;
    }
}