// Given a binary search tree
// and an integer k, implement a method to find and return the kth smallest node.

public TreeNode findKthSmallest(TreeNode root, int k) {
    if(root == null) return null;
    //if(k == 1) return root;
    int len = 0;
    if(root.left != null) {
        len = subTree(root.left);
        if(len == k - 1) return root;
        if(len == k) return root.left;
        if(k < len) {
            return findKthSmallest(root.left, k);
        }
    }
    if(k == 1) return root;
    return findKthSmallest(root.right, k - len - 1);

}

public int subTree(TreeNode node) {
        if(node == null) return 0;
        return 1 + subTree(node.left) + subTree(node.right);
    }
