package OnlineCode.xf;

import java.util.*;

class Pair{
    int val;
    int x;
    int y;
    Pair(int val,int x,int y){
        this.val=val;
        this.x=x;
        this.y=y;

    }
}

public class xf03 {

    public static void solve(int num){
        List<Pair>list=new ArrayList<>();

        for(int i=0;i<10 ;i++){
            for(int j=0;j<10;j++){
                int t1= 1<<i ;
                int t2=(int)Math.pow(3,j);
                if(t1*t2> num)break;
                list.add( new Pair(t1*t2, i,j) );
            }
        }
        Collections.sort(list, new Comparator<Pair>() {
            @Override
            public int compare(Pair o1, Pair o2) {
                if (o1.val != o2.val) return o2.val - o1.val; // val 降序
                return o1.y - o2.y; // val 相同，y 升序
            }
        }) ;
        //for(Pair t:list) System.out.println(t.val+" "+t.x+" "+t.y);
        int remain=num;
        List<Integer> ans=new ArrayList<>();
        for(Pair t:list){
            if(t.val<= remain){
                ans.add(t.val);
                remain-=t.val;
            }
            if(remain==0)break;
        }
        System.out.println(ans.size());
        for(int i=0;i<ans.size();i++){
            System.out.print(ans.get(i)+" ");

        }
        System.out.println();

    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();

        for(int i=0;i<n;i++){
            int num=in.nextInt();
            solve(num);
        }
        in.close();
    }

}
