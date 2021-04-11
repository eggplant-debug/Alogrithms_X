package leetcode.linkedlist;
import leetcode.linkedlist.MyLinkedList.ListNode;
public class reverseList {
    //1,2,3,4,5,null


    //5,4,3,2,1,null
    public ListNode reverseList(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode next = curr.next; // 获取2节点，让next节点为2
            curr.next = prev;//把当前的下一个节点纸箱空
            prev = curr;//让当前节点，加载prev上
            curr = next;//curr变为2这个节点，
        }
        return prev;

    }

}
