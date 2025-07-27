package OnlineCode.yongyou;

import java.util.*;

class Task{
    int id;
    int s;
    int t;

    public Task(int id,int s, int t) {
        this.id=id;
        this.s=s;
        this.t=t;
    }
}
public class demo03 {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n= in.nextInt();
        List<Task>list=new ArrayList<>();
        for(int i=0;i< n;i++){
            int s=in.nextInt();
            int t=in.nextInt();
            list.add( new Task(i+1,s,t));
        }
        //Collections.sort(list, new Comparator<Task>() {
        //    @Override
        //    public int compare(Task o1, Task o2) {
        //        return o1.t-o2.t;
        //    }
        //});
        List<Task>tmp=new ArrayList<>();
        Collections.sort(tmp, new Comparator<Task>() {
            @Override
            public int compare(Task o1, Task o2) {
                return o1.t-o2.t;
            }
        });
        Collections.sort(list, new Comparator<Task>() {
            @Override
            public int compare(Task o1, Task o2) {
                return o1.t-o2.t;
            }
        });
        //for(Task a:list)
        //    System.out.println(a.s+" "+a.t);
        int []nums=new int[1000010];

        for(int  i=1;i<=20;i++){
            //System.out.println(list.size());
            for(Task a:list){
                //System.out.println(a.s);
                if(a.s <=i){
                    tmp.add(a);

                }

            }
            System.out.println(tmp.size());
            if(!tmp.isEmpty()){


                //System.out.print(tmp.get(0).id+" ");
                list.remove(tmp.get(0));
                //System.out.println(list.size());
                tmp.remove(tmp.get(0));
            }

        }
    }
}
