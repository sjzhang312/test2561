package OnlineCode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class LC20 {


    public static void main(String[] args) {
        String s="()";
        System.out.println(isValid(s));
    }

    private static boolean isValid(String s){

        Map<Character, Character>map =new HashMap<>();
        map.put(')','(');
        map.put(']','[');
        map.put('}','{');
        Stack<Character>stack =new Stack<>();
        for(int i=0;i<s.length();i++){
            if(map.get(s.charAt(i))==null){
                stack.add(s.charAt(i));

            }else {
                if(map.get(s.charAt(i))!= stack.pop()){
                    return false;
                }
            }
        }
        return true;

    }
}
