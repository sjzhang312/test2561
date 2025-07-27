package OnlineCode.jd;


import java.util.*;

/**
 * 撞车
 */
class Pair{
    int x;
    int v;
    Pair(int x,int v){
        this.x=x;
        this.v=v;
    }
}
public class demo02 {

    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        List<Pair>list=new ArrayList<>();
        int n=in.nextInt();
        for(int i=0;i<n ;i++){
            int x=in.nextInt();
            int v=in.nextInt();
            list.add( new Pair(x,v));
        }
        Collections.sort(list, new Comparator<Pair>() {
            @Override
            public int compare(Pair o1, Pair o2) {
                return o1.x -o2.x;
            }
        });
        //int ans;
        int []dp = new int[n];
        //if(n==1) ans =0 ;
        for(int i=0;i<n;i++)dp[i]=1;
        int cnt=1;
        //System.out.println(dp[0]);
        for(int i=1;i<list.size();i++){
            int tmp=list.get(i).v;
            for(int j=0 ;j<i;j++){
                if(tmp> list.get(j).v){
                    dp[i]=dp[j]+1;
                    cnt=Math.max(dp[i] ,cnt);
                }
            }
        }
        System.out.println(n-cnt);


    }
}
