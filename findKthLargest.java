// Given a
// Binary Search Tree
// and an integer k, implement a method to find and return its kth largest node

public TreeNode findKthLargest(TreeNode root, int k) {
    if(root == null) return null;
    Queue<TreeNode> tree = new LinkedList<>();
    ArrayList<Integer> list = new ArrayList<>();
    tree.add(root);
    while(tree.peek() != null){
        TreeNode curr = tree.poll();
        list.add(curr.data);
        if(curr.left != null) {
            tree.add(curr.left);
        }
        if(curr.right != null) {
            tree.add(curr.right);
        }
    }
    int[] arr = new int[list.size()];
    for(int i = 0; i < list.size(); i++) {
        if (list.get(i) != null) {
            arr[i] = list.get(i);
        }
    }
    Arrays.sort(arr);
    return new TreeNode(arr[arr.length - k]);
}


public TreeNode findKthLargest(TreeNode root, int k) {
    // Add your code below this line. Do not modify any other code.                   

    Stack<TreeNode> stack = new Stack<TreeNode>();
    TreeNode current = root;
    
    while(!stack.empty() || current != null) {
        if (current != null) {
            stack.push(current);
            current = current.right;
        } else {
            current = stack.pop();
            if (k-- == 1) break;
            current = current.left;
        }
    }
    
    return current;
    // Add your code above this line. Do not modify any other code.
}