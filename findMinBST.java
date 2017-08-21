// Given a
// Binary Search Tree
// , return the node with the minimum data

public TreeNode findMin(TreeNode root) {
    if(root == null) return null;
    while(root.left != null) {
        root = root.left;
    }
    return root;
}