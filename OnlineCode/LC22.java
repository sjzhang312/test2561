package OnlineCode;

import java.util.ArrayList;
import java.util.List;

public class LC22 {


    public static void main(String[] args) {
        int n=3;
        List<String> list= generateFun(3);
        System.out.println(list);
    }

    private static List<String> generateFun(int n) {

        List<String >list= new ArrayList<>();
        StringBuffer s1=new StringBuffer();
        System.out.println(s1);
        backTrack( n ,list ,0 ,0,s1);
        return list;

    }

    private static void backTrack(int n, List<String> list, int open, int close,StringBuffer s1) {
        if( s1.length() == n*2){
            list.add(new StringBuffer(s1).toString());
            return ;
        }

        if( open<n){
            s1.append('(');
            backTrack(n ,list, open+1 ,close ,s1);
            s1.deleteCharAt(s1.length()-1);
        }
        if(close<open){
            s1.append(')');
            backTrack(n,list, open ,close+1,s1);
            s1.deleteCharAt(s1.length()-1);

        }

    }
}
