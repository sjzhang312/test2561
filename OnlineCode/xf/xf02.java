package OnlineCode.xf;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class xf02 {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        //int n=in.nextInt();
        String s=in.nextLine();
        int n=s.length();
        //aab
        int ans=0;
        for(int i=1;i< 1<<n;i++){
            Set<Character> set=new HashSet<>();
            for(int j=0;j<n;j++){
                if((i & 1<<j) !=0){
                    set.add(s.charAt(j));
                }
            }
            ans+=set.size();
        }
        System.out.println(ans);
    }
}
