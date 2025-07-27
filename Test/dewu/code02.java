package dewu;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class code02 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        PriorityQueue<Integer>queue=new PriorityQueue<Integer>(
                new Comparator<Integer>() {
                    @Override
                    public int compare(Integer o1, Integer o2) {
                        return o1-o2;
                    }
                }
        );
        //贪心
        int t=a;
        int cnt=0;
        while(t!=0){
            cnt++;
            t/=10;
        }
        int level=cnt-b+1;  //拆分最大的数 位数
        t=a;
        int p=0;
        while(t!=0){
            cnt++;
            int num=t%10;
            if(queue.size()<level){
                queue.add(num);
            }else{
                if(num>queue.peek()){
                    p+=queue.peek();
                    queue.remove();

                    queue.add(num);
                }else p+=num;
            }
            t/=10;
        }
        int e=1,ans=0;
        while(!queue.isEmpty()){
            ans=e*queue.peek()+ans;
            e*=10;
            //System.out.println(queue.peek());
            queue.remove();
        }
        //System.out.println(p);
        System.out.println(ans+p);
    }
}
