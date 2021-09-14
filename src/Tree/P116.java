package Tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author EugeneLi
 * @date 2021/7/14 18:29
 * @school FZU
 * @use
 */

//class Node {
//    public int val;
//    public Node left;
//    public Node right;
//    public Node next;
//
//    public Node() {}
//
//    public Node(int _val) {
//        val = _val;
//    }
//
//    public Node(int _val, Node _left, Node _right, Node _next) {
//        val = _val;
//        left = _left;
//        right = _right;
//        next = _next;
//    }
//};
//public class P116 {
//
//    public Node connect(Node root) {
//
//        Node result=root;
//        Queue<Node> queue=new LinkedList<Node>();
//        if(root!=null) queue.offer(root);
//
//        while (!queue.isEmpty()){
//
//
//            int size = queue.size();
//            Node nodePre=new Node();
//            Node node=new Node();
//            for(int i=0;i<size;i++){
//
//
//                if(i==0){
//                    //取出头部结点
//                    nodePre = queue.peek();
//                    queue.poll();
//                    node=nodePre;
//
//                }else {
//                    node=queue.peek();
//                    queue.poll();
//                    nodePre.next=node;//前一个结点的next指向下一个结点
//                    nodePre=nodePre.next;//移动指针
//                }
//
//                if(node.left!=null) queue.offer(node.left);
//                if(node.right!=null) queue.offer(node.right);
//
//            }
//            //最后一个结点的话 就直接指向空
//            nodePre.next=null;
//
//        }
//        return root;
//
//    }
//}
