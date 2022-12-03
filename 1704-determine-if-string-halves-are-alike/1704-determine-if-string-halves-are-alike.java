class Solution {
    public boolean halvesAreAlike(String s) {
        Set<Character> set = new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        set.add('A');
        set.add('E');
        set.add('I');
        set.add('O');
        set.add('U');
        int n = s.length()/2;
        int counter = 0;
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            if(set.contains(ch)){
                counter++;
            }
            
        }
        for(int i=n;i<s.length();i++){
            char ch = s.charAt(i);
            if(set.contains(ch)){
                counter--;
            }
        }
        
        return counter==0;
    }
}