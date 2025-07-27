package OnlineCode.xf;

import java.util.Scanner;

public class xf072702 {

    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int n=in.nextInt();

        System.out.println(countMaxOne(n));
    }

    private static int countMaxOne(int n) {
        int maxn=0;
        for(int i=2;i<=26;i++){
            int tmp = solve(i,n);
            maxn=Math.max(tmp,maxn);
        }

        return maxn;
    }
    private static  int solve(int base,int n){
        int ans=0;
        while(n!=0){
            int mod=n%base;
            if(mod==1)ans+=1;
            n/=base;
        }
        return ans;
    }
}
