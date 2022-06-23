class Trie {
  Node root;
    public Trie() {
        root =new Node('@');
        
    }
    
    public void insert(String word) {
        Node curr = root;
        for(int i=0;i<word.length();i++){
            if(curr.children.containsKey(word.charAt(i))){
                curr = curr.children.get(word.charAt(i));
                
            }
            else{
                Node node = new Node(word.charAt(i));
                curr.children.put(word.charAt(i),node);
                curr = node;
            }
        }
        curr.is_End = true;
    }
    
    public boolean search(String word) {
        Node curr = root;
        for(int i=0;i<word.length();i++){
            if(curr.children.containsKey(word.charAt(i))){
                curr = curr.children.get(word.charAt(i));
            }
            else{
                return false;
            }
        }
        
        return curr.is_End;
    }
    
    public boolean startsWith(String prefix) {
        Node curr = root;
        for(int i=0;i<prefix.length();i++){
            if(curr.children.containsKey(prefix.charAt(i))){
                curr = curr.children.get(prefix.charAt(i));
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
     boolean is_End;
     Node(char c){
        c = this.c;
        children = new HashMap<>();
        is_End = false;
     }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */