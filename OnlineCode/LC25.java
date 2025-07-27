package OnlineCode;

public class LC25 {


    public static void main(String[] args) {
        ListNode head=new ListNode(1);
        head.next=new ListNode(2);
        head.next.next=new ListNode(3);
        head.next.next.next=new ListNode(4);
        head.next.next.next.next=new ListNode(5);
        ListNode p=reverseKGroup(head,2);
        while(p!=null){
            System.out.println(p.val);
            p=p.next;
        }
    }

    private static ListNode reverseKGroup(ListNode head,int k) {
        if(head==null)return null;
        ListNode p=head;
        int cnt=0;
        while(p!=null && cnt<k){
            p=p.next;
            cnt++;
        }
        ListNode L=new ListNode();
        L.next=null;
        p=head;

        if(cnt==k){
            while(p!=null && cnt>0){
                ListNode q=p;
                p=p.next;
                q.next=L.next;
                L.next=q;
                cnt--;
            }
            head.next=reverseKGroup(p,k);
        }else{
            return head;
        }
        return L.next;
    }
}
