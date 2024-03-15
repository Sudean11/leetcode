public class InvertTree {

    public TreeNode invertTree(TreeNode root) {
        if(root == null){
            return null;
        }
        TreeNode node = new TreeNode();
        node.left = invertTree(root.right);
        node.right = invertTree(root.left);
        return node;
    }


    public static void main(String[] args) {

    }
}
