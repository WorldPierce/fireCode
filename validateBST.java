// Given the root node of a Binary Tree, determine if it is a Binary Search Tree.

public static boolean validateBST(TreeNode root) {
    
    if(root.left == null && root.right == null) return true;
    
    return leftCheck(root.left, root.data) && rightCheck(root.right, root.data);

}

public static boolean leftCheck(TreeNode left, int head) {
    if (left == null) return true;
    if(left.data > head) return false;
    boolean leftBranch = true, rightBranch = true;
    if(left.left != null) {
        if(left.data < left.left.data || head < left.left.data) return false;
        leftBranch =  leftCheck(left.left, head);
    }
    if(left.right != null) {
        if(left.data > left.right.data || head < left.right.data) return false;
        rightBranch =  leftCheck(left.right, head);
    }
    return leftBranch && rightBranch;
        
        
}

public static boolean rightCheck(TreeNode right, int head) {
    if(right == null) return true;
    if(right.data < head) return false;
    boolean leftBranch = true, rightBranch = true;
    if(right.left != null) {
        if(right.data < right.left.data || head > right.left.data) return false;
        leftBranch =  rightCheck(right.left, head);
    }
    if(right.right != null) {
        if(right.data > right.right.data || head > right.right.data) return false;
        rightBranch =  rightCheck(right.right, head);
    }
    return leftBranch && rightBranch;
}