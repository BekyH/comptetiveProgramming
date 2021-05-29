class MyCircularQueue {
    List<Integer> list;
    int count;
        public MyCircularQueue(int k) {
            list = new ArrayList<>();
            count = k;
        }
        
        public boolean enQueue(int value) {
            if(list.size()<count){
                list.add(value);
                return true;
    
            }
            return false;
        }
        
        public boolean deQueue() {
             if(list.size()>0){
                 list.remove(0);
                 return true;
             }
            return false;
        }
        
        
        public int Front() {
            if(list.size()>0){
            return list.get(0);
            }
            return -1;
        }
        
        public int Rear() {
            if(list.size()>0){
              return list.get(list.size()-1);
            }
            return -1;
        }
        
        public boolean isEmpty() {
            if(list.size()==0){
                return true;
            }
            return false;
        }
        
        public boolean isFull() {
            if(list.size()==count){
                return true;
            }
            return false;
        }
    }
    