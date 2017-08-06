// Write a function to convert a binary tree into its mirror image and 
// return the root node of the mirrored tree.

public TreeNode mirror(TreeNode root) {
    if(root == null) return null;
    TreeNode temp  = root.left;
    //root.left = root.right;
    //root.right = temp;
    root.left = mirror(root.right);
    root.right = mirror(temp);
    return root;
}