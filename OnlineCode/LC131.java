package OnlineCode;

import java.util.ArrayList;
import java.util.List;

public class LC131 {


    public static void main(String[] args) {
        String s="aab";
        List<List<String>>ans=partition(s);
        System.out.println(ans);
    }

    private static List<List<String>> partition(String s) {
        int n =s.length();
        int [][]dp= new int[s.length()][s.length()];
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                dp[i][j]=1;
            }
        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(dp[i+1][j-1]==1 && s.charAt(i)==s.charAt(j))
                    dp[i][j]=1;
            }
        }
        List<List<String>>ans=new ArrayList<>();
        dfs(s,0,dp,ans);
        return ans;

    }
    private  static  List<String>list=new ArrayList<>();
    private static StringBuffer s1=new StringBuffer();
    private  static  String s2="";

    private static void dfs(String s, int i, int[][] dp, List<List<String>>ans) {
        if(i==s.length())ans.add(new ArrayList<>(list));
        for(int j=i;j<s.length();j++){
            if(dp[i][j]==1){
                list.add(s.substring( i,j+1));
                dfs( s, j+1,dp,ans);
                list.remove(list.size()-1);
            }
        }

    }

}
