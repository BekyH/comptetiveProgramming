class Trie {
Node root;
    public Trie() {
        root = new Node('@');
    }
    
    public void insert(String word) {
        Node current = root;
        for(int i=0;i<word.length();i++){
            if(current.children.containsKey(word.charAt(i))){
                current = current.children.get(word.charAt(i));
            }
            else{
                Node node = new Node(word.charAt(i));
                current.children.put(word.charAt(i),node);
                current = node;
            }
        }
        current.is_end = true;
    }
    
    public boolean search(String word) {
        Node current = root;
        for(int i=0;i<word.length();i++){
            if(current.children.containsKey(word.charAt(i))){
                current = current.children.get(word.charAt(i));
                
            }
            else{
              return false;
            }
        }
        
        return current.is_end;
    }
    
    public boolean startsWith(String prefix) {
        Node current = root;
        for(int i=0;i<prefix.length();i++){
            if(current.children.containsKey(prefix.charAt(i))){
                current = current.children.get(prefix.charAt(i));
                
            }
            else{
              return false;
            }
        }
        
        return true;
    }
}
class Node{
    char c;
    HashMap<Character,Node> children;
    boolean is_end;
    Node(char c){
        this.c = c;
        this.children = new HashMap<>();
       this. is_end = false;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */