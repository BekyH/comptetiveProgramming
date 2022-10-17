            class Solution {
                public boolean checkIfPangram(String sentence) {
                    int [] count = new int[26];
                    for(int i=0;i<sentence.length();i++){
                          char ch = sentence.charAt(i);
                          count[ch-'a']++;
                          

                    }
                    for(int index:count){
                        if(index==0){
                            return false;
                        }
                    }

                    return true;
                }
            }