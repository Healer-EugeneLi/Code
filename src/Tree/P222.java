package Tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author EugeneLi
 * @date 2021/7/16 10:30
 * @school FZU
 * @use
 * 计算完全二叉树的结点个数
 */
public class P222 {

    /**
     * 层序遍历
     * @param root
     * @return
     */
//    public int countNodes(TreeNode root) {
//
//        if(root==null) return 0;
//
//        Queue<TreeNode> queue=new LinkedList<TreeNode>();
//
//        queue.offer(root);
//
//        int num=0;
//
//        while (!queue.isEmpty()){
//
//            int size = queue.size();
//
//            for(int i=0;i<size;i++){
//
//                TreeNode peek = queue.peek();
//                num++;//结点数+1
//
//                queue.poll();
//
//                if(peek.left!=null) queue.offer(peek.left);
//                if(peek.right!=null) queue.offer(peek.right);
//
//            }
//
//
//        }
//        return num;
//
//    }


    /**
     * 使用递归法
     * @param root
     * @return
     */
//    public int countNodes(TreeNode root) {
//
//
//        if(root==null) return 0;
//
//        return countNodes(root.left)+countNodes(root.right)+1;
//
//    }


    /**
     * 使用公式+递归
     * @param root
     * @return
     */
    public int countNodes(TreeNode root) {

        if(root==null) return 0;

        TreeNode left = root.left;
        TreeNode right = root.right;
        int leftDepth=0;
        int rightDepth=0;
        while (left!=null){
            left=left.left;
            leftDepth++;
        }

        while (right!=null){
            right=right.right;
            rightDepth++;
        }

        if(leftDepth==rightDepth){
            //此时是满二叉树 直接使用公式计算即可
            return (2<<leftDepth)-1;
        }

        return countNodes(root.left)+countNodes(root.right)+1;
    }
}
