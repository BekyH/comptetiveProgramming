public class makingFileNamesUnique {
    public String[] getFolderNames(String[] names) {
        String[] result = new String[names.length];
        int index = 0;
        HashMap<String,Integer> hashmap = new HashMap<>();
        for(String word:names){
            if(hashmap.containsKey(word)){
                int k = hashmap.get(word);
                 StringBuilder newword = new StringBuilder(word);
                newword.append("(");
                newword.append(k);
                newword.append(")");
                while(hashmap.containsKey(newword.toString())){
                    newword = new StringBuilder(word);
                    k = k+1;
                    newword.append("(");
                    newword.append(k);
                    newword.append(")");
                }
                
                hashmap.put(word,k);
                hashmap.put(newword.toString(),1);
                result[index++]=newword.toString();
            }
            else{
                hashmap.put(word,1);
                result[index++] = word;
            }
        }
        return result;
}
