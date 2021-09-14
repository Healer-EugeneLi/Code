package Tree;

import java.util.ArrayList;
import java.util.List;

/**
 * @author EugeneLi
 * @date 2021/7/16 20:31
 * @school FZU
 * @use
 */
public class P257 {

    public List<String> binaryTreePaths(TreeNode root) {


        List<String > res=new ArrayList<>();
        List<Integer> path=new ArrayList<>();
        if(root==null) return res;

        getPath(root,path,res);
        return res;


    }


    public void getPath(TreeNode root,List<Integer> path,List<String> res){

        //进来之后先添加值
        path.add(root.val);

        if(root.left==null&&root.right==null) {

            String s="";
            //说明已经到达了叶子节点
            for(int i=0;i<path.size()-1;i++){

                s+=path.get(i);
                s+="->";
            }
            //最后一个数字后面不需要加->
            s+=path.get(path.size()-1);

            res.add(s);
        }
        if(root.left!=null){
            //左子树不为空
            getPath(root.left,path,res);
            //回溯
            path.remove(path.size()-1);//移除最后一个
        }

        if (root.right!=null){
            //右子树不为空
            getPath(root.right,path,res);
            path.remove(path.size()-1);
        }



    }
}
