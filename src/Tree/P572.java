package Tree;

/**
 * @author EugeneLi
 * @date 2021/7/16 21:59
 * @school FZU
 * @use
 * 是否为子树
 */
public class P572 {

    public boolean isSubtree(TreeNode root, TreeNode subRoot) {

        boolean res=false;

        if(root!=null&&subRoot!=null){

            if(root.val==subRoot.val){
                //根节点相同 判断树是否一样
                res=isTheSame(root,subRoot);

            }
            //如果不相等
            if(res==false){
                //判断root的左子树里有没有subRoot
                res=isSubtree(root.left,subRoot);
            }

            if(res==false){
                //判断右子树里有没有subRoot
                res=isSubtree(root.right,subRoot);
            }

        }

        return res;

    }

    /**
     * 两颗树是否一样
     * @param p
     * @param q
     * @return
     */
    public boolean isTheSame(TreeNode p,TreeNode q){


        if(p==null&&q==null) return true;

        if(p!=null&&q!=null){

            if(p.val==q.val){
                //继续判断左子树是否一样 右子树是否一样
                boolean left=isTheSame(p.left,q.left);
                boolean right=isTheSame(p.right,q.right);
                boolean res=left&&right;
                return res;
            }

            return false;
        }

        return false;
    }
}
