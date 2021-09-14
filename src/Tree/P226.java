package Tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author EugeneLi
 * @date 2021/7/14 19:05
 * @school FZU
 * @use
 */
public class P226 {

//    public TreeNode invertTree(TreeNode root) {
//
//        //使用bfs层次遍历来做
//
//        Queue<TreeNode> queue=new LinkedList<TreeNode>();
//
//        if(root!=null) queue.offer(root);
//
//        while (!queue.isEmpty()){
//
//            int size = queue.size();
//            for(int i=0;i<size;i++){
//
//                TreeNode peek = queue.peek();
//                queue.poll();
//                swap(peek);
//
//                if(peek.left!=null) queue.offer(peek.left);
//                if(peek.right!=null) queue.offer(peek.right);
//
//            }
//        }
//
//        return root;
//
//    }


    public TreeNode invertTree(TreeNode root) {

        //使用递归来做

        if(root==null) return root;

        swap(root);
        invertTree(root.right);
        invertTree(root.left);
        return root;

    }

    public void swap(TreeNode root){

        TreeNode temp=root.left;
        root.left=root.right;
        root.right=temp;

    }
}
