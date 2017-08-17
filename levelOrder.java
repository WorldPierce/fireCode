// Given a binary tree, write a method to perform a levelorder traversal and return an 
// ArrayList of integers containing the data of the visited nodes in the correct order

public ArrayList<Integer> levelorder(TreeNode root) {
    if(root == null) return null;
    ArrayList<Integer> ordered = new ArrayList<>();
    Queue<TreeNode> lvl = new LinkedList<>();
    lvl.add(root);
    while(lvl.peek() != null) {
        TreeNode curr = lvl.poll();
        ordered.add(curr.data);
        if(curr.left != null) {
            lvl.add(curr.left);
        }
        if(curr.right != null) {
            lvl.add(curr.right);
        }
    }
    return ordered;
}