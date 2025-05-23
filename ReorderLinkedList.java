public class ReorderLinkedList {

    class ListNode{
        int val;
        MergeTowList.ListNode next;
        ListNode(){}
        ListNode(int val) {this.val =val;}
        ListNode(int val, MergeTowList.ListNode next) {this.val = val; this.next = next;}
    }

    public void reorderList(ListNode head){
        if(head == null){
            return;
        }

        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode prev = null,  curr = slow, temp;

        while( curr != null){
            temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }

        ListNode first = head, second = prev;

        while(second.next != null){
            temp = first.next;
            first.next = second;
            first = temp;

            temp = second.next;
            second.next = first;
            second = temp;
        }
    }


}
