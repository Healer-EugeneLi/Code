package Tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author EugeneLi
 * @date 2021/7/15 23:11
 * @school FZU
 * @use
 */
public class P101 {

    public boolean isSymmetric(TreeNode root) {

        //1.使用递归法判断
        //2.迭代法
        if(root==null) return true;

        return byQueueIter(root);

//        return compare(root.left,root.right);



    }



    //1.使用递归法
    private boolean compare(TreeNode left, TreeNode right) {

        if(left==null&&right!=null) return false;
        else if(left!=null&&right==null) return false;
        else if(left==null&&right==null) return true;
        else if(left.val!=right.val) return false;

        //接下去就是单层逻辑
        boolean out=compare(left.left,right.right);//比较外侧
        boolean in=compare(left.right,right.left);//比较neice
        boolean res=in&&out;
        return res;
    }


    //2.使用迭代法
    private boolean byQueueIter(TreeNode root) {

        Queue<TreeNode> queue=new LinkedList<TreeNode>();

        queue.offer(root.left);
        queue.offer(root.right);

        while (!queue.isEmpty()){

            TreeNode left = queue.peek();
            queue.poll();//记住要弹出
            TreeNode right = queue.peek();
            queue.poll();

            if(left==null&&right==null){
                //说明是符合对称的
                continue;
            }

            //如果是其中一个为空 或者值不相等都是不为对称的
            if(left==null||right==null||left.val!=right.val) return false;

            //满足对称条件 继续加入队列
            queue.offer(left.left);//左边外侧
            queue.offer(right.right);//右边外侧
            queue.offer(left.right);//左边内侧
            queue.offer(right.left);//右边内侧

        }

        return true;


    }


}
