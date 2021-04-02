import java.util.HashMap;

class Trie {
    TrieNode root;
    /** Initialize your data structure here. */
    public Trie() {
        root = new TrieNode('@');

    }

    /** Inserts a word into the trie. */
    public void insert(String word) {
        TrieNode current = root;
        for(int i=0;i<word.length();i++){
            if(current.children.containsKey(word.charAt(i))){
                current = current.children.get(word.charAt(i));
            }
            else{
                TrieNode node = new TrieNode(word.charAt(i));
                current.children.put(word.charAt(i),node);
                current = node;
            }
        }
        current.isEnd = true;
    }

    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        TrieNode current = root;
        for(int i=0;i<word.length();i++){
            if(current.children.containsKey(word.charAt(i))){
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
        TrieNode current = root;
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
class TrieNode{
    char data;
    boolean isEnd;
    HashMap<Character, TrieNode> children;
    public TrieNode(char data){
        this.data = data;
        this.isEnd = false;
        this.children = new HashMap<>();
    }

}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */