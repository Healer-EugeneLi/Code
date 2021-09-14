package Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author EugeneLi
 * @date 2021/7/14 17:05
 * @school FZU
 * @use
 */

//class Node {
//    public int val;
//    public List<Node> children;
//
//    public Node() {}
//
//    public Node(int _val) {
//        val = _val;
//    }
//
//    public Node(int _val, List<Node> _children) {
//        val = _val;
//        children = _children;
//    }
//};
//
//public class P429 {
//
//    public List<List<Integer>> levelOrder(Node root) {
//
//
//        List<List<Integer>> result=new ArrayList<>();
//
//        Queue<Node> queue=new LinkedList<Node>();
//
//        if(root!=null)
//            queue.offer(root);
//
//        while (!queue.isEmpty()){
//
//            List<Integer> level=new ArrayList<>();
//
//            int size = queue.size();
//
//            for(int i=0;i<size;i++){
//
//                Node peek = queue.peek();
//                queue.poll();
//
//                level.add(peek.val);//添加值
//
//                List<Node> children = peek.children;
//                for(Node node:children){
//                    queue.offer(node);
//                }
//
//
//            }
//
//            result.add(level);
//
//        }
//        return result;
//
//    }
//}
