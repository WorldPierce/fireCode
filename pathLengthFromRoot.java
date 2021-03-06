// Given the root of a Binary Tree  and an integer that represents the data value of a 
// TreeNode present in the tree, write a method - 
// pathLengthFromRoot that returns the distance between the root and that node. 
// You can assume that the given key exists in the tree. The distance is defined as the 
// minimum number of nodes that must be traversed to reach the target node.

public int pathLengthFromRoot(TreeNode root, int n1) {
    if(root == null) return 0;
    TreeNode curr = root;
    Queue<TreeNode> currentLevel = new LinkedList<>();
    Queue<TreeNode> nextLevel = new LinkedList<>();
    int count = 1;
    currentLevel.add(curr);
    while(currentLevel.peek() != null) {
        curr = currentLevel.poll();
        if(curr.data == n1) {
            return count;
        }
        if(curr.left != null) {
            nextLevel.add(curr.left);
        }
        if(curr.right != null) {
            nextLevel.add(curr.right);
        }
        if(currentLevel.peek() == null) {
            count+=1;
            currentLevel = nextLevel;
            nextLevel = new LinkedList<>();
        }
    }
    return count;
}