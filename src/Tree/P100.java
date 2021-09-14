package Tree;

import java.util.logging.Level;

/**
 * @author EugeneLi
 * @date 2021/7/16 21:55
 * @school FZU
 * @use 判断两颗树是否相同
 */
public class P100 {

    public boolean isSameTree(TreeNode p, TreeNode q) {


        if(p==null&&q==null) return true;//两棵树都是空的话 相同
        else if(p!=null&&q!=null){

            if(p.val==q.val){
                //当前节点一样 判断子树

                //先判断左子树
                boolean left=isSameTree(p.left,q.left);
                boolean right=isSameTree(p.right,q.right);

                boolean res=left&&right;
                return res;
            }else
                return false;

        }else
            return false;//肯定不一样

    }
}
