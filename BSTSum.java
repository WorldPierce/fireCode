// Given a binary tree, write a method to find and return the sum of all the elements using recursion. 
// For an empty tree the sum is 0.

public int sum(TreeNode root) { 
      if(root == null) return 0;
    return sum(root.left) + root.data + sum(root.right);
}