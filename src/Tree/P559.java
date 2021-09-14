package Tree;

import 集合.Person;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author EugeneLi
 * @date 2021/7/16 0:11
 * @school FZU
 * @use
 */

class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
}
public class P559 {


    //使用层序遍历
//    public int maxDepth(Node root) {
//
//        if(root==null) return 0;
//
//        Queue<Node> queue=new LinkedList<Node>();
//
//        queue.offer(root);
//
//        int res=0;
//
//        while (!queue.isEmpty()){
//
//            res+=1;
//            int size = queue.size();
//
//            for(int i=0;i<size;i++){
//
//                Node peek = queue.peek();
//                queue.poll();
//
//                List<Node> children = peek.children;
//                for (Node node:children){
//                    queue.offer(node);
//                }
//
//
//            }
//        }
//        return res;
//
//    }

    //使用递归
    public int maxDepth(Node root) {


        if(root==null) return 0;

        List<Node> children = root.children;

        int depth=0;

        for (Node node:children){

            depth=Math.max(depth,maxDepth(node));
        }
        return depth+1;


    }

}
