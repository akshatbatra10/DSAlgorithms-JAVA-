/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    public Node cloneGraph(Node node) {
        if (node == null) {
            return node;
        }
        Node clone = new Node(node.val);
        cloneG(node, clone, new Node[101]);
        return clone;
    }
    public void cloneG(Node node, Node clone, Node[] visited) {
        visited[clone.val] = clone;
        for (Node nbrs : node.neighbors) {
            if (visited[nbrs.val] == null) {
                Node nn = new Node(nbrs.val);
                clone.neighbors.add(nn);
                cloneG(nbrs, nn, visited);
            } else {
                clone.neighbors.add(visited[nbrs.val]);
            }
        }
    }
}