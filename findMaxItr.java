
// Write a method to find the maximum element in a binary tree iteratively.
public int findMaxItr(TreeNode root) {
    if(root == null) return 0;
    TreeNode curr = root;
    int max = curr.data;
    Queue<TreeNode> currentLevel = new LinkedList<>();
    Queue<TreeNode> nextLevel = new LinkedList<>();
    currentLevel.add(root);
    while(currentLevel.peek() != null) {
        curr = currentLevel.poll();
        if(curr.data > max) {
            max = curr.data;
        }
        if(curr.left != null) {
            nextLevel.add(curr.left);
        }
        if(curr.right != null) {
            nextLevel.add(curr.right);
        }
        if(currentLevel.peek() == null) {
            currentLevel = nextLevel;
            nextLevel = new LinkedList<>();
        }
    }
    return max;
}