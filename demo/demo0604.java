package demo;

import org.w3c.dom.ls.LSOutput;

import java.util.Comparator;
import java.util.PriorityQueue;

public class demo0604 {


    public static void main(String[] args) {

        PriorityQueue<Integer> queue =new PriorityQueue<Integer>(
                new Comparator<Integer>() {
                    @Override
                    public int compare(Integer o1, Integer o2) {
                        return o1-o2;
                    }
                }
        );
        int k=3;
        for(int i=0;i<4;i++){
            if(queue.size()<k){
                queue.add(i);
            }else{
                if(queue.peek()<k){
                    queue.remove();
                    queue.add(i);
                }
            }
        }
        while(!queue.isEmpty()){
            System.out.println(queue.remove());
        }

        System.out.println(1);
    }
}

