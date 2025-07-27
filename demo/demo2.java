import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * 数组中前k个小的数字
 */
public class demo2 {
    public static int[] fun(int[] nums,int k){

        PriorityQueue<Integer>queue=new PriorityQueue<Integer>(
                new Comparator<Integer>(){
                    public int compare(Integer num1,Integer num2){
                        return Integer.compare(num2,num1);
                    }
                }
        );
        for(int num:nums){
            if(queue.size()< k){
                queue.offer(num);

            }else{
                if(queue.peek() >num){
                    queue.poll();
                    queue.offer(num);
                }
            }
        }
        int[] res= new int[k];
        for(int i=0;i<k;i++)
            res[i]= queue.poll();

        return res;


    }
    public static void main(String[] args) {
        int []nums ={3,1,2,5,7};
        int []res=fun(nums,2);
        for(int i=0;i<2;i++)
            System.out.print(res[i]+" ");

    }
}
