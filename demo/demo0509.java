package demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class demo0509 {
    public static <E> void printArray(E[] inputArray){
        for(E element:inputArray){
            System.out.printf( "%s ", element );
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Stack<Integer>stack =new Stack<>();
        stack.push(10);
        stack.push(11);

        while(!stack.isEmpty()){
            Integer peek = stack.peek();
            System.out.println(peek);
            stack.pop();
        }
        Integer[] intArray = { 1, 2, 3 };
        String[] stringArray = { "Hello", "World" };
        printArray( intArray  );
        printArray( stringArray  );

        List<String> stringCollection = new ArrayList<>();
        stringCollection.add("ddd2");
        stringCollection.add("aaa2");
        stringCollection.add("bbb1");
        stringCollection.add("aaa1");
        stringCollection.add("bbb3");
        stringCollection.add("ccc");
        stringCollection.add("bbb2");
        stringCollection.add("ddd1");

        stringCollection
                .stream()
                .filter((s) -> s.startsWith("a"))
                .forEach(System.out::println);

        //stringCollection.forEach(System.out::println);
        stringCollection.stream().sorted().filter((s)->s.startsWith("a"))
                .forEach(System.out::println);


        stringCollection.stream().map(String::toUpperCase)
                .sorted((a,b)->b.compareTo(a))
                .forEach(System.out::println);

        System.out.println('A'+32=='a');
    }
}
