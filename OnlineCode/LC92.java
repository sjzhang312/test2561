package OnlineCode;

import java.util.List;

public class LC92 {


    public static void main(String[] args) {

        ListNode L =new ListNode(1);
        L.next=new ListNode(2);
        L.next.next=new ListNode(3);
        L.next.next.next=new ListNode(4);
        L.next.next.next.next=new ListNode(5);
        ListNode p=reverseListNode(L,2,4);
        while(p!=null){
            System.out.println(p.val);
            p=p.next;
        }

    }

    private static ListNode reverseListNode(ListNode head,int l,int r) {

        int cnt=0;
        ListNode p=head;
        ListNode L=new ListNode();
        L.next=head;
        ListNode pre=L;

        while(p!=null){
            cnt++;
            ListNode tmp=null;
            if(cnt==l){
                tmp=p;
                while(cnt<=r && p!=null ){
                    ListNode q=p;
                    p=p.next;
                    q.next=pre.next;
                    pre.next=q;
                    cnt++;
                }
                tmp.next=p;
                break;
            }

            pre=p;
            p=p.next;

        }
        return L.next;

    }
}
