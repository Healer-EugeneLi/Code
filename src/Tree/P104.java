package Tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author EugeneLi
 * @date 2021/7/15 23:52
 * @school FZU
 * @use
 */
public class P104 {

    //1.递归

//    public int maxDepth(TreeNode root) {
//
//        if(root==null) return 0;
//
//        return depth(root);
//
//
//    }
//
//    private int depth(TreeNode root) {
//
//        if(root==null) return 0;
//
//        int left=depth(root.left);
//        int right=depth(root.right);
//
//        return 1+Math.max(left,right);
//
//
//    }

    //2.使用层序遍历

    public int maxDepth(TreeNode root) {

        return getMaxDepthByLevel(root);

    }

    private int getMaxDepthByLevel(TreeNode root) {


        if(root==null) return 0;

        Queue<TreeNode> queue=new LinkedList<TreeNode>();
        queue.offer(root);

        int res=0;

        while (!queue.isEmpty()){

            res+=1;//进入一层 深度加1
            int size = queue.size();

            for(int i=0;i<size;i++){

                TreeNode peek = queue.peek();
                queue.poll();

                if(peek.left!=null) queue.offer(peek.left);
                if(peek.right!=null) queue.offer(peek.right);


            }

        }

        return res;
    }


}
