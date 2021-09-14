package Tree;

import javax.management.Query;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author EugeneLi
 * @date 2021/7/16 0:32
 * @school FZU
 * @use
 */
public class P111 {


    /**
     * 使用递归法
     * @param root
     * @return
     */
//    public int minDepth(TreeNode root) {
//
//        if(root==null) return 0;
//
//        if(root.left==null&&root.right!=null)
//            return 1+minDepth(root.right);//如果只有一边有结点的话 判断那一边即可
//        if(root.right==null&&root.left!=null)
//            return 1+minDepth(root.left);
//
//        int left=minDepth(root.left);
//        int right=minDepth(root.right);
//
//
//        int depth=Math.min(left,right);
//        return depth+1;
//
//    }


    /**
     * 使用层序遍历法
     * @param root
     * @return
     */
    public int minDepth(TreeNode root) {


        if(root==null) return 0;

        Queue<TreeNode> queue=new LinkedList<TreeNode>();

        queue.offer(root);
        int depth=0;

        while (!queue.isEmpty()){


            depth+=1;
            int size = queue.size();

            for (int i=0;i<size;i++){

                TreeNode peek = queue.peek();
                queue.poll();

                if(peek.left!=null) queue.offer(peek.left);
                if(peek.right!=null) queue.offer(peek.right);
                //当左右结点为空的时候 说明已经是最小深度了
                if(peek.left==null&&peek.right==null) return depth;
            }
        }

        return depth;



    }
}
