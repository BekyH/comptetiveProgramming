public class ReplaceWords {
    public String replaceWords(List<String> dictionary, String sentence) {
        String[] sent = sentence.split(" ");
        StringBuilder result = new StringBuilder();

        Trie trie = new Trie();
        for (String word : dictionary) {
            trie.insert(word);

        }
        for (String word : sent) {
            int[] index = new int[1];
            if (trie.search(word, index)) {
                String str = word.substring(0, index[0]);
                result.append(str);
                result.append(" ");
            } else {
                result.append(word);
                result.append(" ");
            }
        }
        return result.toString().trim();
    }
}

class Trie {
    TrieNode root;

    /** Initialize your data structure here. */
    public Trie() {
        root = new TrieNode('@');
    }

    /** Inserts a word into the trie. */
    public void insert(String word) {
        TrieNode current = root;
        for (int i = 0; i < word.length(); i++) {
            if (current.children.containsKey(word.charAt(i))) {
                current = current.children.get(word.charAt(i));
            } else {
                TrieNode new_node = new TrieNode(word.charAt(i));
                current.children.put(word.charAt(i), new_node);
                current = new_node;
            }
        }
        current.is_End = true;
    }

    public boolean search(String word, int[] index) {
        TrieNode current = root;
        for (int i = 0; i < word.length(); i++) {
            if (current.children.containsKey(word.charAt(i)) && !current.is_End) {
                current = current.children.get(word.charAt(i));
                index[0]++;
            } else if (current.is_End) {
                return true;
            } else {
                return false;
            }

        }
        return false;

    }

}

class TrieNode {
    boolean is_End;
    char c;
    HashMap<Character, TrieNode> children;

    public TrieNode(char c) {
        this.c = c;
        is_End = false;
        children = new HashMap<>();
    }
}
