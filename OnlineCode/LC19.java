package OnlineCode;

public class LC19 {


    public static void main(String[] args) {
        ListNode head=new ListNode(1);
        head.next=new ListNode(2);
        head.next.next=new ListNode(3);
        head.next.next.next=new ListNode(4);
        head.next.next.next.next=new ListNode(5);
        ListNode p= removeNthFromEnd(head,2);
        while(p!=null){
            System.out.print(p.val+" ");
            p=p.next;
        }
    }

    private static ListNode removeNthFromEnd(ListNode head,int n) {

        ListNode L=new ListNode();
        L.next=head;
        ListNode fast=L,slow=L;
        while(n>0){
            fast=fast.next;
            n--;
        }
        while(fast.next!=null){
            fast=fast.next;
            slow=slow.next;
        }
        slow.next=slow.next.next;
        return L.next;

    }
}
