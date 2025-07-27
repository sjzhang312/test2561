package demo;

import java.util.HashMap;
import java.util.Map;

public class demo0720 {


    public static void main(String[] args) {
        Map<String, Integer>map =new HashMap<>();
        map.put("key1",1);
        map.put("key2",1);
        System.out.println(map.get("key1"));
        for(Map.Entry<String,Integer> entry : map.entrySet()){
            System.out.println(entry.getKey()+" " + entry.getValue());
        }
        map.forEach((key, value) -> System.out.println(key));
    }
}
