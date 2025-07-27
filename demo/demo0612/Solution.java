package demo.demo0612;

public class Solution {

    public static String fun(String []strs){

        String prefix=strs[0];
        for(int i=1;i<strs.length;i++){
            prefix= lpf(prefix,strs[i]);
            //System.out.println(prefix);
        }

        return prefix;
    }

    private static String lpf(String s1, String s2) {
        int i=0,j=0;
        String ans="";
        while(i<s1.length()&&j<s2.length()){
            if(s1.charAt(i)==s2.charAt(j)){
                ans+=s1.charAt(i);
                i++;
                j++;

            }else break;

        }
        return ans;
    }

    public static void main(String[] args) {
        String []strs ={"flower","flow","flight"};
        String ans=fun(strs);
        System.out.println(ans);
    }
}
