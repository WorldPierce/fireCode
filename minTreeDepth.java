// Write a non-recursive method minTreeDepth that takes in the root node of a 
// Binary Tree and returns the minimum depth of the tree. 
// The minimum depth is defined as the least number of node traversals needed to reach a leaf from the root node. 
// Your method should run in linear O(n) time and use at max O(n) space

public int minTreeDepth(TreeNode root) {
    if(root == null) return 0;
    int depth = 1;
    Queue<TreeNode> curLevel = new LinkedList<>();
    Queue<TreeNode> nextLevel = new LinkedList<>();
    curLevel.add(root);
    while(curLevel.peek() != null) {
        TreeNode curr = curLevel.poll();
        if(curr.left == null && curr.right == null) return depth;
        if(curr.left != null) nextLevel.add(curr.left);
        if(curr.right != null) nextLevel.add(curr.right);
        if(curLevel.peek() == null) {
            curLevel = nextLevel;
            nextLevel = new LinkedList<TreeNode>();
            depth++;
        }
        
    }
    return depth;
}