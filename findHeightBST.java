// Given a binary tree, write a method to find its height recursively.
// An empty tree has a height of 0.

public int findHeight(TreeNode root) { 
    if(root == null) return 0;
    if(root.right == null && root.left == null) return 1;
    TreeNode leftBranch = root.left;
    TreeNode rightBranch = root.right;
    int left = 2 + leftCheck(leftBranch);
    int right = 2 + rightCheck(rightBranch);
    if(left >= right) return left;
    return right;

}

public static int leftCheck(TreeNode left) {
    if (left == null) return 0;
    int leftBranch = 0, rightBranch = 0;
    if(left.left != null) {
        leftBranch = 1;
        leftBranch += leftCheck(left.left);
    }
    if(left.right != null) {
        rightBranch = 1;
        rightBranch += leftCheck(left.right);
    }
    int max = leftBranch >= rightBranch ? leftBranch : rightBranch;
    return max;
}

public static int rightCheck(TreeNode right) {
    if(right == null) return 0;
    int leftBranch = 0, rightBranch = 0;
    if(right.left != null) {
        leftBranch = 1;
        leftBranch += rightCheck(right.left);
    }
    if(right.right != null) {
        rightBranch = 1;
        rightBranch += rightCheck(right.right);
    }
    int max = leftBranch >= rightBranch ? leftBranch : rightBranch;
    return max;
}