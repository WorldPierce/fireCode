// Write a function to find the total number of leaf nodes in a binary tree. 
// A node is described as a leaf node
//  if it doesn't have any children. If there are no leaf nodes, return 0.

public int numberOfLeaves(TreeNode root) { 
    if(root == null) return 0;
    int left = 0, right = 0;
    if(root.right == null && root.left == null){
        return 1;
    }
    if(root.left != null){
        left = numberOfLeaves(root.left);
    }
    if(root.right != null) {
        right = numberOfLeaves(root.right);
    }
    return left + right;
}