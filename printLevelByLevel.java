// Given a binary tree, write a method to print the tree level by level.

public ArrayList<ArrayList<Integer>> printLevelByLevel(TreeNode root) {
    
    if(root == null) return new ArrayList<>();
    ArrayList<ArrayList<Integer>> ret = new ArrayList<>();
    ArrayList<Integer> currentLevel = new ArrayList<>();
    TreeNode curr = root;
    Queue<TreeNode> level = new LinkedList<>();
    Queue<TreeNode> nextLevel = new LinkedList<>();
    level.add(curr);
    while(level.peek() != null) {
        curr = level.poll();
        currentLevel.add(curr.data);
        if(curr.left != null) {
            nextLevel.add(curr.left);
        }
        if(curr.right != null) {
            nextLevel.add(curr.right);
        }
        if(level.peek() == null) {
            level = nextLevel;
            nextLevel = new LinkedList<>();
            ret.add(currentLevel);
            currentLevel = new ArrayList<>();
        }
    }
    return ret;
}