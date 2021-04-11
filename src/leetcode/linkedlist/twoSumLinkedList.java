package leetcode.linkedlist;
/*
两数相加
1.普通解法
2.困难解法
 */
public class twoSumLinkedList {public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2){
        ListNode l3 = null;
        String s1;
        /*
        需要有一个标记记录,前一次加法是否有溢出

        如何构建一个自洽的可自增的链表
         */
        while(true){

            l3.val=(l1.val+l2.val)%10;
            ListNode l3_new = new ListNode();
            l3.next=l3_new;
            l3=l3_new;
            l1=l1.next;
            l2=l2.next;
        }

    }
}
