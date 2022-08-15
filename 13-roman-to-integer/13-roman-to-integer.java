class Solution {
    public int romanToInt(String s) {
        HashMap<Character,Integer> hashmap = new HashMap<>();
        hashmap.put('I',1);
        hashmap.put('V',5);
        hashmap.put('X',10);
        hashmap.put('L',50);
        hashmap.put('C',100);
        hashmap.put('D',500);
        hashmap.put('M',1000);
        int sum = 0;
        for(int i=0;i<s.length()-1;i++){
            char ch = s.charAt(i);
            char ch2 = s.charAt(i+1);
            if(hashmap.get(ch2)>hashmap.get(ch)){
                sum = sum-hashmap.get(ch);
            }
               else{
                   sum = sum+hashmap.get(ch);
               }
            
        }
        
        return sum + hashmap.get(s.charAt(s.length()-1));
    }
}