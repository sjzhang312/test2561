package OnlineCode;

import javax.swing.plaf.LabelUI;
import java.util.List;


public class LC23 {


    public static void main(String[] args) {

        ListNode[] lists=new ListNode[3];

        lists[0]=new ListNode(1);
        lists[0].next=new ListNode(4);
        lists[0].next.next=new ListNode(5);
        lists[1]=new ListNode(1);
        lists[1].next=new ListNode(3);
        lists[1].next.next=new ListNode(4);
        lists[2]=new ListNode(2);
        lists[2].next=new ListNode(6);
        ListNode  p=mergeKLists(lists);
        while (p!=null){
            System.out.print(p.val+" ");
            p=p.next;
        }

    }

    private static ListNode mergeKLists(ListNode[] lists) {

        return mergelist(lists , 0 , lists.length-1);

    }

    private static ListNode mergelist(ListNode[] lists, int l, int r) {
        if(l==r)return lists[l];

        if( l<r){
            int mid =(l+r)/2;
            ListNode left= mergelist(lists,l,mid);
            ListNode right=mergelist(lists,mid+1,r);
            return solve(left,right);
        }
        return null;

    }
    private static ListNode solve(ListNode p,ListNode q){
        ListNode L=new ListNode();
        ListNode r=L;
        while(p!=null && q!=null){
            if(p.val<=q.val){
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
        return  L.next;
    }
}
