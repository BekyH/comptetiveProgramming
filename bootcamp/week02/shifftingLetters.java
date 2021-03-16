package com.company;

public class shifftingLetters {
    public String shiftingLetters(String S, int[] shifts) {
        long shiftSum = 0;
        String result = "";
        for(long element:shifts){
            shiftSum = shiftSum + element;
        }
        for(int i = 0;i<S.length();i++){
            long shift = S.charAt(i) + shiftSum;

            shiftSum = shiftSum -shifts[i];
            if(shift>122){
                long diff = shift - 123;
                long x = 97 + (diff%26);
                result  = result + (char)x;

            }
            else{
                result = result + (char)shift;

            }
        }
        return result;

    }
}
