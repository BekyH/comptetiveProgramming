class Solution {
    public int wateringPlants(int[] plants, int capacity) {
          int container = capacity;
          int steps = 0;
          for(int i=0;i<plants.length;i++){
                if(container>=plants[i]){
                    steps++;
                    container= container - plants[i];
                }
                else{
                    steps = steps +i;
                    steps  = steps+i+1;
                    container= capacity - plants[i];
                }
              
          }
        
        return steps;
    }
}