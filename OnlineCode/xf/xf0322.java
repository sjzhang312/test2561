package OnlineCode.xf;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class xf0322 {

    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        int n= in.nextInt();
        in.nextLine();
        char []ch=in.nextLine().toCharArray();
        String s1="";
        s1+=ch[0];
        List<String> list=new ArrayList<>();
        for(int i=1;i<ch.length;i++){
            if(ch[i]==ch[i-1])
                s1+=ch[i];
            else{
                list.add(s1);
                s1="";
                s1+=ch[i];

            }

        }
        list.add(s1);
        for(int i=0;i<list.size();i++) System.out.println(list.get(i));
        System.out.println(list);
        List<String>ans =new ArrayList<>();
        for(String t:list){
            if(t.length() %2 !=0){
                ans.add(t);
            }
            else {
                ans.add(t.substring(0,3));
                ans.add(t.substring(3));
            }
        }
        System.out.println(ans);
        System.out.println(ans.toString().replace("[","").replace("]","").replace(",",""));
        System.out.println(ans.toString().replace("[","").replace("]","").replace(",",""));
    }
}
