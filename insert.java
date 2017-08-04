// Implement a method to insert a node into a
// Binary Search Tree
// . Return the root of the modified tree.

public TreeNode insert(TreeNode root, int data) { 
    if(root == null) return new TreeNode(data);
    else if(data < root.data) root.left = insert(root.left, data);
    else if(data > root.data) root.right = insert(root.right, data);
    return root;
}