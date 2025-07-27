package OnlineCode;

public class LC21 {


    public static void main(String[] args) {
        ListNode L1=new ListNode(1);
        L1.next=new ListNode(2);
        L1.next.next=new ListNode(4);
        
        ListNode L2=new ListNode(1);
        L2.next=new ListNode(3);
        L2.next.next=new ListNode(4);
        
        ListNode p=MergeSortListNode(L1,L2);
        while(p!=null){
            System.out.print(p.val+" ");
            p=p.next;
        }
    }

    private static ListNode MergeSortListNode(ListNode l1, ListNode l2) {
        ListNode L=new ListNode();
        ListNode r=L;
        while(l1!=null && l2!=null){
            if(l1.val <=l2.val){
                r.next=l1;
                l1=l1.next;
            }else{
                r.next=l2;
                l2=l2.next;
            }
            r=r.next;
        }
        if(l1!=null)r.next=l1;
        if(l2!=null)r.next=l2;

        return L.next;
    }

}
