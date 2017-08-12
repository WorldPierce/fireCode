// Given a binary tree, write a method to find and return its deepest node. 
// Return null for an empty tree.

public TreeNode findDeepest(TreeNode root) { 
    if(root == null) return null;
    Queue<TreeNode> queue = new LinkedList<>();
    queue.add(root);
    TreeNode curr = null;
    while(queue.peek() != null) {
        curr = queue.remove();
        if(curr.left != null) {
            queue.add(curr.left);
        }
        if(curr.right != null) {
            queue.add(curr.right);
        }
    }
    return curr;
}