import java.util.ArrayList;
import java.util.List;

/**
 * 全排列
 */
public class CompleteRank {
    private static List<String> list1=new ArrayList<>();
    static String  s1=new String();
    public static void fun(String s,int n,int []b){
        //System.out.println(i);
        //System.out.println(s1);
        if(s1.length()==n){
            list1.add(s1);
            return ;
        }

        StringBuffer sb=new StringBuffer(s1);


        for(int k=0;k<n;k++){
            if(b[s.charAt(k)-'a'] ==0){
                b[s.charAt(k)-'a'] =1;
                sb.append(s.charAt(k));
                s1= sb.toString();
                fun(s, n ,b);
                b[s.charAt(k)-'a'] =0;
                sb.deleteCharAt(sb.length()-1);
            }
        }

    }

    public static void main(String[] args) {
        String s="abc";
        String s1="";
        int b[] = new int[26];
        //for(int i=0;i<26;i++)
        //    System.out.print(b[i]+" ");
        //for(int i=0;i<s.length();i++)
        //    b[s.charAt(i)-'a']=1;

        fun(s,s.length(),b);


        for(int i=0;i<list1.size();i++)
            System.out.print(list1.get(i)+" ");
    }


}
