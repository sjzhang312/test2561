package OnlineCode;

import java.util.HashMap;
import java.util.Map;

public class LC76 {

    public static void main(String[] args) {
        String s="it's tuesday";
        String t="std";
        String ans=minnStr(s,t);
        System.out.println(ans);
    }

    private static String minnStr(String s,String t) {


        HashMap<Character,Integer>mapt=new HashMap<>();
        HashMap<Character,Integer>maps=new HashMap<>();
        int j=0;
        int cnt=Integer.MAX_VALUE;
        String ans="";
        for(int i=0;i<t.length();i++){
            mapt.put(t.charAt(i) ,mapt.getOrDefault(t.charAt(i),0) +1);
        }

        int i=0;
        for( ;i<s.length();i++){
            maps.put( s.charAt(i) ,maps.getOrDefault(s.charAt(i),0) +1);
            //System.out.println(check(mapt, maps));

            while(check(mapt, maps) && j<=i){
                if(i-j +1<cnt){
                    cnt=i-j+1;
                    ans=s.substring(j,i+1);
                }
                //maps.remove( s.charAt(j));
                maps.compute(s.charAt(j) , (k, integer) -> integer - 1);
                j++;
            }


        }


        return ans;

    }
    private static boolean check(HashMap<Character,Integer>mapt, HashMap<Character,Integer>maps){
        for(Map.Entry<Character,Integer> entry: mapt.entrySet()){
            Character key = entry.getKey();
            Integer value = entry.getValue();
            if(maps.get(key)==null)return  false;
            if( maps.get(key) <value)return false;
        }
        return true;

    }

}
