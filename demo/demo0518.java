package demo;

import java.util.Arrays;
import java.util.List;

public class demo0518 {
}

class ListNode{
    int val;
    ListNode next;
    ListNode(){}
    ListNode(int val){
        this.val=val;
        this.next=null;
    }
}
class Solution{
    public static boolean fun(ListNode head){

        ListNode slow=head;
        ListNode fast=head;
        while( fast!=null){
            slow=slow.next;
            if(fast.next==null)return false;
            fast=fast.next.next;
            if(fast==null)return  false;
            if(fast.next==slow)
                return true;
        }


        return false;
    }

    public static void main(String[] args) {
        ListNode head=new ListNode(1);
        head.next= new ListNode(2);
        head.next.next=new ListNode(3);
        head.next.next.next=new ListNode(4);
        //head.next.next.next.next=head.next;
        System.out.println(fun(head));

        int []nums=new int[3];
        List<int[]> list = Arrays.asList(nums);

        for(int i=0;i<list.get(0).length;i++) System.out.println(list.get(0)[i]);
        System.out.println(Arrays.toString(list.get(0)));
        System.out.println(Arrays.toString(nums));

        Integer []num=new Integer[3];
        for(int i=0;i<num.length;i++)num[i]=1;
        List<Integer> list1 = Arrays.asList(num);
        System.out.println(list1);

    }
}
