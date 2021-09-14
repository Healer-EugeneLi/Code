package Tree;

/**
 * @author EugeneLi
 * @date 2021/7/16 11:23
 * @school FZU
 * @use
 * 判断是否是一个平衡二叉树
 */
public class P110 {

    public boolean isBalanced(TreeNode root) {


        if(getDepth(root)==-1) return false;

        return true;

    }

    public int getDepth(TreeNode root){

        if(root==null) return 0;//当越过叶子节点时，返回高度 00 ；

        //当左（右）子树高度 left== -1 时，代表此子树的 左（右）子树 不是平衡树，因此直接返回 -1

        int leftDepth=getDepth(root.left);
        if(leftDepth==-1) return -1;//左节点的子树不是平衡二叉树
        int rightDepth=getDepth(root.right);
        if(rightDepth==-1) return -1;


        //当左右树的高度差大于1 说明不是平衡二叉树 直接返回-1
        if(Math.abs(leftDepth-rightDepth)>1) return -1;
        else
            return 1+Math.max(leftDepth,rightDepth);//是平衡二叉树的话 就是根节点1+子节点的高度


    }





}
