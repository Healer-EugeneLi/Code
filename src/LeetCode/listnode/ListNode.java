package LeetCode.listnode;

/**
 * @author EugeneLi
 * @date 2021/9/14 10:03
 * @school FZU
 * @use
 */
public class ListNode {

    int val;
    ListNode next;
    ListNode(){};
    ListNode(int val){
        this.val=val;
    }
    ListNode(int  val,ListNode next){
        this.val=val;
        this.next=next;
    }
}
