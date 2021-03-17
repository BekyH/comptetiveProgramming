package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class groupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> hashmap = new HashMap();
        List<List<String>> result = new ArrayList<>();
        for(String word:strs){
            String sorted = sort(word);
            List<String> list = hashmap.get(sorted);
            if(list==null){
                list = new ArrayList<>();
                list.add(word);
                hashmap.put(sorted,list);
            }
            else{
                list.add(word);
                hashmap.put(sorted,list);
            }
        }
        for(List<String> list :hashmap.values()){
            result.add(list);
        }
        return result;
    }
    public String sort(String word){
        char[] arr = word.toCharArray();
        Arrays.sort(arr);
        String sorted = new String(arr);
        return sorted;
    }
}

