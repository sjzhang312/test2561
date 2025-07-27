package OnlineCode.yongyou;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class demo01 {


    public static void main(String[] args) {


        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        Map<Character,Integer> map=new HashMap<>();
        int ans=0;
        int j=0;
        int maxn=0;
        String s1="";
        for(int i=0;i<s.length();i++){
            if((s.charAt(i)>='1'&&s.charAt(i)<='9')||(s.charAt(i)>='a'&&s.charAt(i)<='z')||s.charAt(i)=='_'||(s.charAt(i)>='A'&&s.charAt(i)<='Z')  ){
                if(ans==0)j=i;
                ans++;
                //System.out.println(j);
            }
            else {
                if(ans>maxn){
                    s1=s.substring(j ,j+ans);

                    maxn=ans;
                    ans=0;
                }
            }
        }
        if(ans>maxn)s1=s.substring(j,j+ans);
        System.out.println(s1);


    }
}
