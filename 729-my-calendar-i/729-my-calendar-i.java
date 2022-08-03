class MyCalendar {
    List<int[]> list;
    public MyCalendar() {
        list = new ArrayList<>();
    }
    
    public boolean book(int start, int end) {
    //  Collections.sort(list);
          for(int[] lst:list){
              int first = lst[0];
              int second = lst[1];
              if(first<end && start<second){
                  return false;
              }
          }
        int [] current = {start,end};
        list.add(current);
        return true;
    }
}

/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(start,end);
 */