// Given a BST, write a function to return its diameter. The diameter of a 
// Binary Tree is defined as the "Number of nodes on the longest path between two leaf nodes".

public int[] diameterAndHeight(TreeNode root) {
		int heightDiameter[] = { 0, 0 };          // initialize the diameter and height 
		if (root != null) {
			int[] leftResult = diameterAndHeight(root.left);
			int[] rightResult = diameterAndHeight(root.right);
			int height = Math.max(leftResult[1], rightResult[1]) + 1;
			int leftDiameter = leftResult[0];
			int rightDiameter = rightResult[0];
			int rootDiameter = leftResult[1] + rightResult[1] + 1;
			int finalDiameter = Math.max(rootDiameter, Math.max(leftDiameter, rightDiameter));
			heightDiameter[0] = finalDiameter; 
			heightDiameter[1] = height;
		} 
		return heightDiameter;
}
	
public int diameter(TreeNode root) {
    int[] result = diameterAndHeight(root);
    return result[0];
}