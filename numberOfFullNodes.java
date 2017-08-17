// Write a function to iteratively determine the total number of "full nodes" in a binary tree. 
// A full node contains left and right child nodes. If there are no full nodes, return 0.

public int numberOfFullNodes(TreeNode root) {
    if(root == null) return 0;
    int count = 0;
    Queue<TreeNode> currentRow = new LinkedList<>();
    currentRow.add(root);
    while(currentRow.peek() != null) {
        TreeNode curr = currentRow.poll();
        count = curr.left != null && curr.right != null ? count + 1: count;
        if(curr.left != null) {
            currentRow.add(curr.left);
        }
        if(curr.right != null) {
            currentRow.add(curr.right);
        }
    }
    return count;
}