package OnlineCode;

import java.util.List;

public class LC142 {

    public static void main(String[] args) {
        ListNode head=new ListNode(3);
        head.next=new ListNode(2);
        head.next.next=new ListNode(0);
        head.next.next.next=new ListNode(-4);
        head.next.next.next.next= head.next;
        ListNode p= judgeCycle(head);
        System.out.println(p.val);
    }

    private static ListNode judgeCycle(ListNode head) {
        if(head== null)  return  head;
        ListNode fast=head ,slow=head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(slow==fast) break;
        }
        if(fast!=slow)
            return null;
        ListNode p= head,q=slow;
        while(p!=q){
            p=p.next;
            q=q.next;
        }
        return p;

    }
}
