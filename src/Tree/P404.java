package Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author EugeneLi
 * @date 2021/7/17 16:32
 * @school FZU
 * @use
 * 左叶子之和
 */
public class P404 {

//    public int sumOfLeftLeaves(TreeNode root) {
//
//        if(root==null) return 0;
//
//
//        int leftSum=sumOfLeftLeaves(root.left);
//        int rightSum=sumOfLeftLeaves(root.right);
//
//        int mid=0;
//
//        if(root.left!=null&&root.left.left==null&&root.left.right==null){
//            //此时的root.left就是叶子节点
//            mid=root.left.val;
//        }
//
//        int sum=mid+leftSum+rightSum;
//        return sum;
//
//
//
//
//    }

    //使用迭代法
    public int sumOfLeftLeaves(TreeNode root) {

        if(root==null) return 0;

        Queue<TreeNode> queue=new LinkedList<TreeNode>();
        queue.offer(root);

        int sum=0;

        while (!queue.isEmpty()){

            int size = queue.size();

            TreeNode peek = queue.peek();
            queue.poll();
            //通过节点的父节点来判断其左孩子是不是左叶子了。
            if(peek.left!=null&&peek.left.left==null&&peek.left.right==null){
                sum+=peek.left.val;
            }

            if(peek.left!=null){
                queue.offer(peek.left);
            }
            if(peek.right!=null){
                queue.offer(peek.right);
            }


        }

        return sum;

    }


}
