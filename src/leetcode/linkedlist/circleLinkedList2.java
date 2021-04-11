package leetcode.linkedlist;

import java.util.HashSet;
import java.util.Set;
import leetcode.linkedlist.circleLinkedList.ListNode;

public class circleLinkedList2 {
    public circleLinkedList.ListNode detectCycle(ListNode head){
        Set<ListNode> hashnode= new HashSet<>();
        while(head!=null){
            if(!hashnode.add(head)){
                return head;
            }
            head=head.next; //可以想想，这个为什么要放在这，能不能放在第11行的位置(现在的11行往下诺一行)，这样相当于从2号位置开始了
        }
        return null;
    }


}
