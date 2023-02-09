class Solution {
    public int maximumSwap(int num) {
        List<Integer> list = new ArrayList<>();
        List<Integer> lst = new ArrayList<>();
        int temp = num;
        while(temp>0){
            int curr = temp%10;
            list.add(curr);
            lst.add(curr);
            temp = temp/10;
            
        }
        Collections.sort(list);
        Collections.reverse(list);
        Collections.reverse(lst);
        
        // System.out.println(lst);
        for(int i=0;i<list.size();i++){
            if(list.get(i)>lst.get(i)){
                int num0 = list.get(i);
                int index = lst.lastIndexOf(num0);
                int num2 = lst.get(i);
                int num3 = lst.get(index);
                lst.set(i,num3);
                lst.set(index,num2);
                break;
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int num5:lst){
            sb.append(num5);
        }
    return Integer.parseInt(sb.toString());
}
    }
   