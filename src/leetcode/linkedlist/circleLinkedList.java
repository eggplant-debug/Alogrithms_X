package leetcode.linkedlist;
//解法1. 快慢指针
//解法2. 哈希表，遍历一遍查看存储

import java.util.HashSet;
import java.util.Set;

public class circleLinkedList {
    class ListNode{
        int val;
        ListNode next;
        ListNode(int x){  //尾结点
            val=x;
            next=null;

        }

    }
    public boolean hasCycle(ListNode head){
//        Set<ListNode> seen=new HashSet<ListNode>();
//        seen.add(head);一部分 哈希表解法， 这个add 方法返回 boolean数值





        if(head==null || head.next==null){
            return false;
        }
        ListNode slowpointer= head.next;

        ListNode Fastpointer=head.next.next;
        while(true){
            if (slowpointer==null||Fastpointer==null||Fastpointer.next==null){
                return false;
            }



            if (slowpointer==Fastpointer){
                return true;
            }



        }
    }


}
