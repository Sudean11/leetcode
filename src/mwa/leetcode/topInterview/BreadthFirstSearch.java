package mwa.leetcode.topInterview;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BreadthFirstSearch {
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
BreadthFirstSearch(){
    TreeNode node5 = new TreeNode(5);
    TreeNode node4 = new TreeNode(4);

    // Creating the node with value 2 and attaching the node 5 as the right child
    TreeNode node2 = new TreeNode(2, null, node5);

    // Creating the node with value 3 and attaching the node 4 as the right child
    TreeNode node3 = new TreeNode(3, null, node4);

    // Creating the root node with value 1 and attaching the nodes 2 and 3
    TreeNode root = new TreeNode(1, node2, node3);
    System.out.println(levelOrder(root));
}

    public List<Integer> rightSideView(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<Integer> list = new ArrayList<>();
        queue.add(root);
        queue.add(null);
        while (queue.peek() != null){
            int lastNode = root.val;
            while(queue.peek() != null){
                lastNode = queue.peek().val;
                root = queue.poll();
                if(root.left!= null) {
                    queue.add(root.left);
                }
                if(root.right != null){
                    queue.add(root.right);
                }
            }
            list.add(lastNode);
            queue.add(queue.poll());
        }
        return list;
    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        queue.add(null);
        boolean leftToRight = false;
        while(queue.peek() != null){
            List<Integer> subList = new ArrayList<>();

            while(queue.peek() != null){
                TreeNode node = queue.poll();
                subList.add(node.val);
                if(leftToRight){
                    if(node.left != null) queue.add(node.left);
                    if(node.right != null) queue.add(node.right);
                }else{
                    if(node.right != null) queue.add(node.right);
                    if(node.left != null) queue.add(node.left);
                }
                leftToRight = !leftToRight;
            }
            list.add(subList);
            queue.add(queue.poll());
        }
        return list;
    }



    public List<Double> averageOfLevels(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();

        queue.add(root);
        queue.add(null);

        List<Double> list = new ArrayList<>();
        while(!queue.isEmpty()){
            double sum = 0;
            int count = 0;
            while(queue.peek() != null){
                TreeNode node = queue.peek();
                sum+=node.val;
                count++;
                if(node.left != null )queue.add(node.left);
                if(node.right != null) queue.add(node.right);
                queue.poll();
            }
            list.add(sum/count);
            queue.poll();
            if(queue.isEmpty()) break;
            queue.add(null);
        }
        return list;
    }
    public static void main(String[] args) {
        new BreadthFirstSearch();
    }
}
