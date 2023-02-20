class Solution {
    public String validIPAddress(String queryIP) {
        if(queryIP.length()<7){
            return "Neither";
        }
       String [] arr = queryIP.split("[.]");
        // System.out.println(arr.length);
        // for(String str:arr){
        //     System.out.println(str);
        // }
        if(arr.length==4){
            if(queryIP.charAt(0)=='.' || queryIP.charAt(queryIP.length()-1)=='.' || queryIP.contains(":")){
                return "Neither";
            }
            for(int j=0;j<4;j++){
                String elem = arr[j];
                if(elem.length()==0 || elem.length()>3){
                    return "Neither";
                }
                if(elem.length()>1 && elem.charAt(0)=='0'){
                    return "Neither";
                }
                for(int i=0;i<elem.length();i++){
                    if(Character.isDigit(elem.charAt(i))){
                        
                    }
                    else{
                        return "Neither";
                    }
                }
                int num = Integer.parseInt(elem);
                if(num<0 || num>255){
                    return "Neither";
                }
            }
             return "IPv4";
        }
        else{
             if(queryIP.charAt(0)==':' || queryIP.charAt(queryIP.length()-1)==':' || queryIP.contains(".")){
                return "Neither";
            }
            String [] ar = queryIP.split(":");
            if(ar.length!=8){
                return "Neither";
            }
            for(String str:ar){
                if(str.length()>4 || str.length()==0){
                   // System.out.println(str);
                    return "Neither";
                }
                for(char ch : str.toCharArray()){
                  //  char ch = str.charAt(i);
                      if(ch==':'){
                    return "Neither";
                }
                    if(Character.isLetter(ch)){
                        if(!((ch>='A' && ch<='F')|| 
                    (ch>='a' && ch<='f'))){
                            return "Neither";
                        }
                     // System.out.println(ch);
                        
                    }
                }
            }
            return "IPv6";
        }
      
       // return "Neither";
    }
}