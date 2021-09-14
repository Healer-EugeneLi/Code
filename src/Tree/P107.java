package Tree;

import java.util.*;

/**
 * @author EugeneLi
 * @date 2021/7/14 16:22
 * @school FZU
 * @use
 */

class TreeNode {
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


class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {

        List<List<Integer>> result=new ArrayList<>();//保存最后的结果



        Queue<TreeNode> queue=new LinkedList<TreeNode>();


        if(root!=null)

            queue.offer(root);

        while (!queue.isEmpty()){

            List<Integer> level=new ArrayList<>();

            int size = queue.size();

            for (int i=0;i<size;i++){

                TreeNode peek = queue.peek();//第一个结点的值 不移除

                level.add(peek.val);//保存结果值
                queue.poll();//移除第一个结点

                if(peek.left!=null) queue.offer(peek.left);//插入队列
                if(peek.right!=null) queue.offer(peek.right);

            }

            result.add(level);//加入某一层


        }

        Collections.reverse(result);
        return result;


    }
}
public class P107 {
}
