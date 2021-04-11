package leetcode.linkedlist;
// 哨兵节点的使用
public class MyLinkedList {
        int size;
        ListNode head;
        public class ListNode{
                int val;
                ListNode next;
                ListNode(int x)
                        {
                                val=x;
                        }

        }

        /** Initialize your data structure here. */
        public MyLinkedList() {
                size=0;
                head=new ListNode(0);

        }

        /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
        public int get(int index) {
                ListNode curr=head;

                for(int i=0;i<index+1;i++){
                        if(curr.next==null || index==0){
                                return -1;
                        }
                        curr=curr.next;
                }
                return curr.val;
        }

        /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
        public void addAtHead(int val) {

        }

        /** Append a node of value val to the last element of the linked list. */
        public void addAtTail(int val) {

        }

        /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
        public void addAtIndex(int index, int val) {
                ListNode curr=head;
                if(index+2>size){
                        return;
                }
                for(int i=0;i<index;i++){
                        curr=curr.next;

                }



                size+=1;

        }

        /** Delete the index-th node in the linked list, if the index is valid. */
        public void deleteAtIndex(int index) {

        }


/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */
}
