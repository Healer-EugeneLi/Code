package Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author EugeneLi
 * @date 2021/7/14 16:43
 * @school FZU
 * @use
 * 层次遍历 返回最右侧的那个结点
 */





public class P199 {

    public List<Integer> rightSideView(TreeNode root) {

        List<Integer> result=new ArrayList<>();

        Queue<TreeNode> queue=new LinkedList<TreeNode>();
        if(root!=null) queue.offer(root);

        while (!queue.isEmpty()){

            int size = queue.size();

            for(int i=0;i<size;i++){

                TreeNode peek = queue.peek();

                queue.poll();//移除

                if(i==size-1){
                    //最右侧的结点
                    result.add(peek.val);
                }

                if(peek.left!=null) queue.offer(peek.left);
                if(peek.right!=null) queue.offer(peek.right);
            }

        }

        return result;
    }
}
