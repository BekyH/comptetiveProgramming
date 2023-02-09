class Solution {
    public String reformatDate(String date) {
        HashMap<String,String> map = new HashMap<>();
        map.put("Jan","01");
         map.put("Feb","02");
         map.put("Mar","03");
         map.put("Apr","04");
         map.put("May","05");
         map.put("Jun","06");
         map.put("Jul","07");
         map.put("Aug","08");
         map.put("Sep","09");
         map.put("Oct","10");
         map.put("Nov","11");
         map.put("Dec","12");
        String [] str = date.split(" ");
        StringBuilder sb = new StringBuilder();
        StringBuilder day = new StringBuilder();
        sb.append(str[2]);
        sb.append("-");
        sb.append(map.get(str[1]));
        sb.append("-");
        String s = str[0];
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
          if(Character.isDigit(ch)){
              day.append(ch);
          }  
          else{
              break;
          }
        }
        if(day.length()==1){
            day.append("0");
            day.reverse();
        }
        sb.append(day.toString());
       

        
        return sb.toString();
        
    }
}