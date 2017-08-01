// Given a binary tree, write a recursive method to return the maximum element.

public int findMax(TreeNode root) {
    if(root == null) return 0;
    int rtd = root.data, ld = 0, rd = 0;
    ld = findMax(root.left);
    rd = findMax(root.right);
    
    int max = rtd > ld ? rtd : ld;
    max = max > rd ? max : rd;
    
    return max;
  
}