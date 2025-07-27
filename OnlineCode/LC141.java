package OnlineCode;

public class LC141 {

    public static void main(String[] args) {
        ListNode head=new ListNode(3);
        head.next=new ListNode(2);
        head.next.next=new ListNode(0);
        head.next.next.next=new ListNode(-4);
        head.next.next.next.next=head.next;
        boolean flag = isValid(head);
        System.out.println(flag);
    }

    private static boolean isValid(ListNode head) {
            
        ListNode fast=head,slow=head;
        while(fast!=null && fast.next!=null ){
            
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow)return true;
        }
        return false;
            
    
    
    
    }
}
