package OnlineCode;

import java.util.Stack;

public class LC151 {


    public static void main(String[] args) {
        String s="the  sky is blue";
        String []split= s.split(" ");
        //System.out.println(split);
        //for(int i=0;i<split.length;i++)
        //    System.out.println(split[i]+" ");

        Stack<String>stack =new Stack<>();
        int i=0;
        StringBuffer s1=new StringBuffer();
        for(;i<s.length();i++){
            //System.out.println(i);
            while(i< s.length() && s.charAt(i)!=' '){
                s1.append(s.charAt(i));
                i++;
            }
            if(!s1.isEmpty())
            stack.add(s1.toString());
            s1=new StringBuffer();
        }
        while(!stack.isEmpty()){
            System.out.println(stack.peek());
            stack.pop();
        }
    }
}
