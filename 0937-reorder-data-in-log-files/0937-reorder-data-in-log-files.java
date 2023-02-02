class Solution {
    public String[] reorderLogFiles(String[] logs) {
        List<String> digits = new ArrayList<>();
        List<List<String>> letters = new ArrayList<>();
        for(String log:logs){
            String [] s = log.split(" ");
            char ch = s[1].charAt(0);
            if(Character.isDigit(ch)){
                digits.add(log);
            }
            else{
                String str = log.substring(s[0].length()+1,log.length());
                List<String> list = new ArrayList<>();
                list.add(str);
                list.add(s[0]);
                list.add(log);
                letters.add(list);
            }
        }
        //System.out.println(letters);
        
        Collections.sort(letters,new CustomComparator());
       // System.out.println(letters);
        List<String> result = new ArrayList<>();
        for(List<String> ls:letters){
            result.add(ls.get(2));
        }
        for(String dig:digits){
            result.add(dig);
        }
        return result.toArray(new String[result.size()]);
    }
}
class CustomComparator implements Comparator<List<String>>
    {
        @Override
        public int compare(List<String> o1,
            List<String> o2)
        {
            String first = o1.get(0);
            String second = o2.get(0);
            if(!first.equals(second)){
              return first.compareTo(second); 
            }
            String third = o1.get(1);
            String fourth = o2.get(1);
            return third.compareTo(fourth); 
        }
    }