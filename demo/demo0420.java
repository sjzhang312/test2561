package demo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class demo0420 {


    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("中国加油");
        list.add("世界加油");
        list.add("世界加油");

        long count = list.stream().distinct().count();
        System.out.println(count);

        LocalDate today =LocalDate.now();
        System.out.println(today);
        LocalDateTime time = LocalDateTime.now();
        System.out.println(time);

        new Thread(()-> System.out.println("hello world") ).start();

        int []array =new int[3];

        //List<Integer> nums= new ArrayList<Integer>();

        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6);
        List<Integer> collect = numbers.stream().filter(n -> n % 2 == 0).sorted().collect(Collectors.toList());
        System.out.println(collect);
    }
}
