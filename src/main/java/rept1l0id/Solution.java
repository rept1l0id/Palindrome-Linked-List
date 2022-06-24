package src.main.java.rept1l0id;

public class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode mid = middleNode(head);
        ListNode headSecond = reverse(mid);
        ListNode rereversehead = headSecond;
        while(head != null && headSecond != null){
            if(head.val != headSecond.val){
                break;
            }
            head = head.next;
            headSecond = headSecond.next;
        }
        reverse(rereversehead);
        return head == null || headSecond == null;
    }

    public ListNode middleNode (ListNode head){
        ListNode a = head;
        ListNode b = head;
        while(b != null && b.next != null){
            a = a.next;
            b = b.next.next;
        }
        return a;
    }

    public ListNode reverse(ListNode head){
        if(head == null){
            return head;
        }

        ListNode prev = null;
        ListNode present = head;
        ListNode next = present.next;

        while(present != null){
            present.next = prev;
            prev = present;
            present = next;
            if(next != null){
                next = next.next;
            }
        }
        return prev ;
    }
}
