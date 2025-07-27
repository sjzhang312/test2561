package demo;//给你一个仅由数字（0 - 9）组成的字符串 num 。
//请你找出能够使用 num 中数字形成的 最大回文 整数，并以字符串形式返回。该整数不含 前导零 。
//
//注意：
//你 无需 使用 num 中的所有数字，但你必须使用 至少 一个数字。
//数字可以重新排序。
//
//示例 1：
//输入：num = "444947137"
//输出："7449447"
//解释：从 "444947137" 中选用数字 "4449477"，可以形成回文整数 "7449447" 。可以证明 "7449447" 是能够形成的最大回文整数。
//
//示例 2：
//输入：num = "00009"
//输出："9"
//解释：可以证明 "9" 能够形成的最大回文整数。注意返回的整数不应含前导零。

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class demo0416 {

    //请你找出能够使用 num 中数字形成的 最大回文 整数，并以字符串形式返回。该整数不含 前导零 。
    private static String  longestfun(String s) {
        int n=s.length();
        Map<Character,Integer>map =new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i),0)+1);
        }
        int []nums=new int[10];
        //for(int i=0;i<10;i++)nums[i]=0;
        //444947137
        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            Character key =entry.getKey();
            int val= entry.getValue();
            int j=key-'0';

            nums[j]+=val;

        }
        StringBuffer s1=new StringBuffer();
        Character charmax=1;
        int flag=1;
        for(int i=9;i>=0;i--){
            if(nums[i]%2==0){
                for(int j=0;j<nums[i]/2;j++)
                    s1.append(i);
            }else{
                if(flag==1){
                    charmax= (char) ('0'+i);
                    flag=0;
                }
            }
        }
        String s11=s1.toString();
        StringBuffer s2=s1.reverse();
        String ans=s11+charmax+s2.toString();
        return ans;
    }

    public static void main(String[] args) {
        //Scanner in=new Scanner(System.in);
        String s="444947137";
        String ans=longestfun(s);
        //System.out.println('1'-'0');
        System.out.println(ans);
    }


}
