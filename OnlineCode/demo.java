package OnlineCode;

import java.util.*;
import java.util.concurrent.*;

public class demo {

    public static void main(String[] args) {
        //Integer []nums={1,2,3};
        //
        //Arrays.sort(nums, Collections.reverseOrder());
        ////System.out.println(nums);
        //System.out.println(Arrays.toString(nums));
        //
        //int []nums1={4,5,6};
        //System.out.println(nums1);
        //System.out.println(Arrays.toString(nums1));

        //List<Integer> list=new ArrayList<>();
        //list.add(1);
        //list.add(2);
        //list.add(3);
        ////list.get(list.size()-1)=3;
        //list.set(list.size()-1 ,4);
        //System.out.println(list.get(list.size()-1));
        //
        //List<int []>ans=new ArrayList<>();
        //ans.add(new int[]{1,2});
        //ans.add(new int[]{3,4});
        //ans.get(ans.size()-1)[1]=5;
        //for(int i=0;i<ans.size();i++)
        //    System.out.println( Arrays.toString(ans.get(i)));
        //
        //for( int[] i:ans){
        //    System.out.println( Arrays.toString(i));
        //}
        //
        //for(int [] i:ans){
        //    System.out.printf("(%d,%d)\n" , i[0] ,i[1]);
        //}
        //List< Integer >list=new ArrayList<>();
        //List<Integer> list1=new LinkedList<>();
        //list.add(1);
        //list1.add(1);
        //System.out.println(list);
        //System.out.println(list1);
        //String s="123";
        //for(char ch:s.toCharArray()){
        //    System.out.println(ch);
        //}
        //String s1="123";
        //
        //System.out.println(s1.hashCode()==s.hashCode());
        //System.out.println("123".hashCode());
        //System.out.println("Aa".hashCode());     // 2112
        //System.out.println("BB".hashCode());
        //System.out.println("Aa".hashCode()=="BB".hashCode());// 2112
        String string = UUID.randomUUID().toString();
        System.out.println(string);
        HashSet<Character>set=new HashSet<>();
        Map<Integer,Integer>map =new HashMap<>();
        map.put(1,1);
        map.put(2,2);
        map.compute(1, (key,val)->val-1 );
        //System.out.println(integer);
        System.out.println(map.get(1));

    }
}
