package OnlineCode.xf;

import java.util.*;

class House{
    int price;
    int confront;
    House(int price,int confront){
        this.price=price;
        this.confront=confront;
    }
}

public class xf072701 {


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int m=sc.nextInt();
        Long []money =new Long[n];
        for(int i=0;i<n;i++)
            money[i]=sc.nextLong();
        List<House>list=new ArrayList<>();
        for(int i=0;i<m;i++){

            int confront=sc.nextInt();
            int price=sc.nextInt();
            list.add(new House(price,confront));
        }
        Collections.sort(list, new Comparator<House>() {
            @Override
            public int compare(House o1, House o2) {
                return o2.confront-o1.confront;
            }
        });
        Arrays.sort(money);
        int ans=0;
        //System.out.println(list.size());
       for(int i=0;i<money.length;i++){
           for(House t:list){
               int t1=t.price ;
               int t2=t.confront;
               if(money[i]>= t1){
                   ans+=t2;
                   list.remove(t);
                   //System.out.println(list.size());
                   break;
               }
           }
       }
        System.out.println(ans);

    }
}
