package OnlineCode;

public class LC14 {


    public static void main(String[] args) {
        String []strs = {"flower","flow","flight"};
        String s=publicCommonPrefix(strs);
        System.out.println(s);
    }

    private static String publicCommonPrefix(String[] strs) {

        String prefix=strs[0];

        for( int i=1;i< strs.length ;i++){
            prefix= sovle(prefix ,strs[i]);
        }
        return prefix;
    }
    private static String sovle(String s1, String s2){

        String s="";
        int i=0,j=0;
        while(i< s1.length()  && j<s2.length() ){
            if(s1.charAt(i) == s2.charAt(j)){
                s+=s1.charAt(i);
                i++;
                j++;
            }
            else break;
        }
        return s;
    }
}
