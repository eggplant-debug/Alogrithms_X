package leetcode.linkedlist;


public class SwapLinkedList {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode swapNodes(ListNode head,int k){
        int size=0;
        ListNode num=head;
        while (num!=null){
            num=num.next;
            size+=1;
        }
        ListNode temp=null;
        ListNode temp2=null;
        int changePos= size-k+1;
        int index=0;
        while(head!=null){
            if(k==index){
    
            }
            head=head.next;
        }
        return temp;
    }
}
