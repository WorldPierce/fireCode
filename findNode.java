// Given a binary tree, write a method to find and 
// return the node with data = the input data. Do not use recursion.

public TreeNode findNode(TreeNode root, int val) {
    if(root == null) return null;
    ArrayDeque<TreeNode> queue = new ArrayDeque<>();
    queue.add(root);
    while(queue.peek() != null) {
        TreeNode curr = queue.remove();
        if(curr.data == val) {
            return curr;
        }
        if(curr.left != null) {
            queue.add(curr.left);
        }
        if(curr.right != null) {
            queue.add(curr.right);
        }
    }
    return null;
}