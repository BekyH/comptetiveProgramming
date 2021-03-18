package com.company;

import java.util.*;

public class mostCommonWords {
    public String mostCommonWord(String paragraph, String[] banned) {
        HashSet<String> bannedSet = new HashSet<>();
        HashMap<String,Integer> hashmap = new HashMap();
        paragraph = paragraph.toLowerCase();
        paragraph = paragraph.replaceAll("[,]"," ");
        paragraph = paragraph.replaceAll("[,.!?';'']", "");
        paragraph = paragraph.replaceAll("  "," ");
        String [] arr = paragraph.split(" ");
        PriorityQueue<Integer> maxheap = new PriorityQueue<>(Collections.reverseOrder());
        String result = "";
        for(String word:banned){
            bannedSet.add(word);
        }

        for(String s:arr){
            //  System.out.println(s);
            if(!bannedSet.contains(s)){
                if(hashmap.containsKey(s)){
                    int val  = hashmap.get(s);
                    val = val +1;
                    hashmap.put(s,val);
                }
                else{
                    hashmap.put(s,1);
                }
            }
        }
        for(int val:hashmap.values()){
            maxheap.add(val);
        }
        for(Map.Entry<String,Integer> e:hashmap.entrySet()){
            System.out.println(e.getKey() +  ":" + e.getValue());
            if(maxheap.peek()==e.getValue()){
                result = result + e.getKey();
            }

        }
        return result;

    }
}
