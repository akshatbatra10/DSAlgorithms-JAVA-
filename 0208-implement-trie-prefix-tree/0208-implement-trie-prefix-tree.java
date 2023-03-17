class Trie {

    private TriesNode rootNode; 

    class TriesNode{

        private char key;
        private boolean isEnd;

        private Map<Character,TriesNode> preFixMap;

        public TriesNode(char key){
            this.key = key;
            preFixMap = new HashMap<>();
        }
    }

    public Trie() {
        rootNode = new TriesNode('/');
    }

    public void insert(String word) {

        TriesNode tempNode = rootNode;
        for(int i = 0 ; i <word.length();i++){
              char c = word.charAt(i);
              TriesNode findNode = tempNode.preFixMap.get(c);
              if(findNode == null){
                  findNode=new TriesNode(c);
                  tempNode.preFixMap.put(c,findNode);
              }
             tempNode = findNode;
        }
        tempNode.isEnd = true;

    }

    public boolean search(String word) {
        TriesNode searchNode = searchHelper(word);
        return searchNode != null && searchNode.isEnd; 
    }

    public boolean startsWith(String prefix) {
          return searchHelper(prefix) != null;
    }
    public TriesNode searchHelper(String word){

          TriesNode tempNode = rootNode; 
         for(int i = 0 ; i <word.length();i++){
              char c = word.charAt(i);
              TriesNode findNode = tempNode.preFixMap.get(c);
              if(findNode == null){
                  return null;
              }
             tempNode = findNode;
        }
        return tempNode;
    }
}