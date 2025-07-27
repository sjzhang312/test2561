package OnlineCode;

import java.util.List;

public class LC148 {


    public static void main(String[] args) {
        ListNode head=new ListNode(4);
        head.next=new ListNode(2);
        head.next.next=new ListNode(1);
        head.next.next.next=new ListNode(3);
        ListNode p=sortListNode(head);
        while(p!=null){
            System.out.print(p.val+" ");
            p=p.next;
        }
    }

    private static ListNode sortListNode(ListNode head) {
        if(head.next==null)return head;
        ListNode L=new ListNode();
        ListNode fast=head;
        ListNode slow=head;
        ListNode pre=L;
        while(fast!=null &&fast.next!=null){
            fast=fast.next.next;
            pre=slow;
            slow=slow.next;

        }
        pre.next=null;

        ListNode p=sortListNode(head);
        ListNode q=sortListNode(slow);
        return merge(p,q);



    }
    private static ListNode merge(ListNode p,ListNode q){
        ListNode L=new ListNode();
        ListNode r=L;
        while(p!=null && q!=null ){
            if(p.val <=q.val){
                r.next=p;
                p=p.next;
            }else {
                r.next=q;
                q=q.next;
            }
            r=r.next;
        }
        while(p!=null){
            r.next=p;
            p=p.next;
            r=r.next;
        }
        while(q!=null){
            r.next=q;
            q=q.next;
            r=r.next;
        }
        return L.next;
    }
}
