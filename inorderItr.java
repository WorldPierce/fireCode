// Given a binary tree, write a method to perform the inorder traversal iteratively. 
// Append the data of each node visited to an ArrayList. 
// Return an empty Arraylist in the case of an empty tree.

public ArrayList<Integer> inorderItr(TreeNode root) {
    if(root == null) return new ArrayList<Integer>();
    if(root.left == null && root.right == null) {
        ArrayList<Integer> inOrder =  new ArrayList<Integer>();
        inOrder.add(root.data);
        return inOrder;
    }
    ArrayList<Integer> inOrder =  new ArrayList<Integer>();
    inOrder.addAll(inorderItr(root.left));
    inOrder.add(root.data);
    inOrder.addAll(inorderItr(root.right));
    
    return inOrder;
}