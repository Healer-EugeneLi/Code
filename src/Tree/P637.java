package Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author EugeneLi
 * @date 2021/7/14 16:56
 * @school FZU
 * @use
 */
public class P637 {


    public List<Double> averageOfLevels(TreeNode root) {

        List<Double> result=new ArrayList<>();
        Queue<TreeNode> queue=new LinkedList<TreeNode>();

        if (root!=null) queue.offer(root);

        while (!queue.isEmpty()){
            //不为空的时候


            double sum=0;
            int size = queue.size();

            for (int i=0;i<size;i++){

                TreeNode peek = queue.peek();//
                sum+=peek.val;
                queue.poll();//移除
                if(peek.left!=null) queue.offer(peek.left);
                if (peek.right!=null) queue.offer(peek.right);

            }
            result.add(sum/size);
        }

        return result;
    }
}
