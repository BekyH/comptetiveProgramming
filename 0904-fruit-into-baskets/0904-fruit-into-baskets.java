class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int max = Integer.MIN_VALUE;
        int left = 0;
        int right = 0;
        while(right<fruits.length){
          map.put(fruits[right],map.getOrDefault(fruits[right],0)+1);
          while(map.size()>2){
              int val = map.get(fruits[left]);
              val = val-1;
              if(val==0){
                  map.remove(fruits[left]);
              }
              else{
                  map.put(fruits[left],val);
              }
                  left++; 
              
             
          }
            max = Math.max(max,right-left+1);
            right++;
        }
        
        
        return max;
    }
}