// Given a binary tree, write a method to iteratively traverse the tree in the preorder manner. 
// Mark a node as visited by adding its data to a list - Arraylist <Integer> preorderedList. 
// Return this list.

public ArrayList<Integer> preorderItr(TreeNode root) {
    ArrayList<Integer> preorderedList = new ArrayList<>();
    if(root == null) return preorderedList;
    Stack<TreeNode> stack = new Stack<>();
    stack.push(root);
    while(!stack.empty()) {
        TreeNode node = stack.pop();
        preorderedList.add(node.data);
        if(node.right != null) {
            stack.push(node.right);
        }
        if(node.left != null) {
            stack.push(node.left);
        }
    }
    return preorderedList;
}