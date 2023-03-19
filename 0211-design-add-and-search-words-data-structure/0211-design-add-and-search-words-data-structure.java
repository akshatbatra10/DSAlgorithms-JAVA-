class WordDictionary {
  class TrieNode {
    boolean isWord;
    TrieNode[] children;
    
    public TrieNode() {
      isWord = false;
      children = new TrieNode[26];
    }
  }
  
  TrieNode root;

  public WordDictionary() {
    root = new TrieNode();
  }

  public void addWord(String word) {
    TrieNode node = root;
    for (int i = 0; i < word.length(); i++) {
      int idx = word.charAt(i) - 'a';
      if (node.children[idx] == null) {
        node.children[idx] = new TrieNode();
      }
      node = node.children[idx];
    }
    node.isWord = true;
  }

  public boolean searching(String word, TrieNode node, int wordIdx) {
    if (node == null) return false;
    for (int i = wordIdx; i < word.length(); i++) {
      int idx = word.charAt(i) - 'a';
      if (idx == (-51)) {
        for (int j = 0; j < node.children.length; j++) {
          if (searching(word, node.children[j], i + 1)) {
            return true;
          }
        }
        return false;
      }
      if (node.children[idx] == null) return false;
      node = node.children[idx];
    }
    return node.isWord;
  }

  public boolean search(String word) {
    return searching(word, root, 0);
  }
}