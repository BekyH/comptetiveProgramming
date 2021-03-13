import java.util.HashMap;

public class Trie {
    Node root;
    /** Initialize your data structure here. */
    public Trie() {
        root = new Node();
    }

    /** Inserts a word into the trie. */
    public void insert(String word){
        Node current = root;
        for(int i = 0;i<word.length();i++){
            if(current!=null && !current.children.containsKey(word.charAt(i))){

                Node node = new Node(word.charAt(i));
                current.children.put(word.charAt(i),node);
            }
            current = current.children.get(word.charAt(i));

        }
        current.isEnd = true;
    }

    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        Node current = root;
        for(int i = 0;i<word.length();i++){
            if(current!=null && current.children.containsKey(word.charAt(i))){
                current = current.children.get(word.charAt(i));
            }
            else{
                return false;
            }
        }
        return current.isEnd;
    }

    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        Node current = root;
        for(int i = 0;i<prefix.length();i++){
            if(current!=null && current.children.containsKey(prefix.charAt(i))){
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
    boolean isEnd;
    HashMap<Character,Node> children;
    public Node(){
        this.isEnd = false;
        this.children = new HashMap<>();
    }
    public Node(char c){
        this.c = c;
        this.children = new HashMap<>();;
        this.isEnd = false;
    }
}
/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */