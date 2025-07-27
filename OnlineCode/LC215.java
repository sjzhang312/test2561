package OnlineCode;

import java.util.Comparator;
import java.util.PriorityQueue;

public class LC215 {

    public static void main(String[] args) {
        int []nums={3,2,1,5,6,4};
        int []nums1={3,2,3,1,2,4,5,5,6};
        System.out.println(findKthNum(nums1,4));
    }

    private static int  findKthNum(int[] nums, int k) {
        PriorityQueue<Integer>queue= new PriorityQueue<>(
                new Comparator<Integer>(){
                    public int compare( Integer o1,Integer o2){
                        return o1-o2;
                    }
                }
        );
        for(int i=0;i<nums.length;i++){
            if(queue.size()<k){
                queue.add(nums[i]);
            }else {
                if(nums[i]> queue.peek()){
                    queue.remove();
                    queue.add(nums[i]);
                }
            }

        }
        return queue.peek();




    }


}
