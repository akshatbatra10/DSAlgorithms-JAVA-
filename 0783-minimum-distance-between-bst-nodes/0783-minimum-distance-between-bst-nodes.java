class Solution {
    List<Integer> inorderNodes = new ArrayList<>();
    
    void inorderTraversal(TreeNode root) {
        if (root == null) {
            return;
        }
        
        inorderTraversal(root.left);
        inorderNodes.add(root.val);
        inorderTraversal(root.right);
    }
    
    public int minDiffInBST(TreeNode root) {
       inorderTraversal(root);
        
        int minDistance = Integer.MAX_VALUE;
        for (int i = 1; i < inorderNodes.size(); i++) {
            minDistance = Math.min(minDistance, inorderNodes.get(i) - inorderNodes.get(i-1));
        }
        
        return minDistance;
    }
};