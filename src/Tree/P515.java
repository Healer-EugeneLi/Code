package Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author EugeneLi
 * @date 2021/7/14 18:15
 * @school FZU
 * @use
 * 在二叉树的每一行中找到最大的值。
 */
public class P515 {

    public List<Integer> largestValues(TreeNode root) {

        List<Integer> result=new ArrayList<>();

        Queue<TreeNode> queue=new LinkedList<TreeNode>();

        if(root!=null) queue.offer(root);
        int max;

        while (!queue.isEmpty()){

            max=Integer.MIN_VALUE;
            int size = queue.size();
            for(int i=0;i<size;i++){

                TreeNode peek = queue.peek();
                queue.poll();

                if(peek.val>max) max=peek.val;//更新最大值

                if(peek.left!=null) queue.offer(peek.left);
                if(peek.right!=null) queue.offer(peek.right);

            }
            result.add(max);

        }

        return result;

    }
}
