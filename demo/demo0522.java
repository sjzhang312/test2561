package demo;

import java.util.*;

public class demo0522 {

    public static void main(String[] args) {


        Stack<Integer>stack=new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        while(!stack.isEmpty()){
            System.out.println(stack.pop());
        }
        Queue<Integer>queue =new ArrayDeque<>();
        queue.add(1);
        queue.offer(2);

        while(!queue.isEmpty()){
            System.out.println(queue.remove());
        }

        Map<Integer,Integer> map =new HashMap<Integer,Integer>();                                               
        map.put(1,1);
        map.put(1,2);
        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            int key= entry.getKey(),val= entry.getValue();
            System.out.println(key+" "+val);
        }
        System.out.println(map);


    }
}


