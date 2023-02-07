class Solution {
    public boolean isRobotBounded(String instructions) {
        int row = 0;
        int col = 0;
        char d = 'N';
        for(int i=0;i<instructions.length();i++){
               char ch = instructions.charAt(i);
               if(ch=='G'){
                   if(d=='N'){
                       col++;
                   }
                   else if(d=='S'){
                       col--;
                   }
                   else if(d=='W'){
                        row--;
                   }
                   else{
                       row++;
                   }

               }
               else if(ch=='R'){
                    if(d=='N'){
                       d='E';
                    }
                    else if(d=='S'){
                           d = 'W';
                    }
                    else if(d=='E'){
                           d='S';
                    }
                    else{
                        d = 'N';
                    }
               }
               else{
                    if(d=='N'){
                       d='W';
                    }
                    else if(d=='S'){
                           d = 'E';
                    }
                    else if(d=='E'){
                           d='N';
                    }
                    else{
                        d = 'S';
                    }
               }
               
        }

        if(row==0 && col==0){
            return true;
        }
        if(d=='N'){
           return false;
        }

        return true;
        
    }
}