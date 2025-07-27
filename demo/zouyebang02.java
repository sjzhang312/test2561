package demo;

import java.util.*;

public class zouyebang02 {
}


// 注意类名必须为 Main, 不要有任何 package xxx 信息
class Main1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
       String s=in.nextLine();
       String s1="";
       List<Integer>list=new ArrayList<>();
       for(int i=0;i<s.length();i++) {
           if (s.charAt(i) == ',') {
               int num = Integer.parseInt(s1);
               list.add(num);
               s1 = "";
           } else {
               s1 += s.charAt(i);
           }
       }
        int num=Integer.parseInt(s1);
        list.add(num);
       //for(int i=0;i<list.size();i++) System.out.println(list.get(i));
       // System.out.println(Integer.getInteger(s));
       // System.out.println( Integer.parseInt(s));
        int maxn=list.get(0);
        int minn=list.get(0);
        int minnt=list.get(0);
        for(int i=1;i<list.size();i++){
            int t=list.get(i);
            maxn=Math.max(Math.max(t,maxn*t),minn*t) ;
            minn=Math.min(Math.min(t,maxn*t),minn*t) ;
            if(t>0)minnt=Math.min(t,minnt);
        }
   
        System.out.println(maxn/minnt);
    }
}