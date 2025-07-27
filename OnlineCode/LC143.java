package OnlineCode;

public class LC143 {


    public static void main(String[] args) {
        ListNode head=new ListNode(1);
        head.next=new ListNode(2);
        head.next.next=new ListNode(3);
        head.next.next.next=new ListNode(4);
        head.next.next.next.next=new ListNode(5);
        ListNode p= reorderList(head);
        while(p!=null){
            System.out.print(p.val+" ");
            p=p.next;
        }
    }

    private static ListNode reorderList(ListNode head) {
        if(head==null || head.next==null || head.next.next==null)return head;
        ListNode fast=head;
        ListNode slow=head;
        while( fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        ListNode tmp=slow;
        ListNode Lhead=new ListNode();
        while(slow!=null){
            ListNode q=slow;
            slow=slow.next;
            q.next=Lhead.next;
            Lhead.next=q;
        }
        ListNode p1=head ,p2 =Lhead.next;
        ListNode L=new ListNode();
        ListNode r=L;
        while(p1!= tmp && p2!=null){
            r.next=p1;
            r=r.next;
            p1=p1.next;

            r.next=p2;
            r=r.next;

            p2=p2.next;
        }
        while(p2!=null){
            r.next=p2;
            r=r.next;
            p2=p2.next;
        }
        return L.next;

    }
}
