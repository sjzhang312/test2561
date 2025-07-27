package OnlineCode;

public class LC32 {


    public static void main(String[] args) {
        String s=")()())";
        System.out.println(longestValid(s));
    }

    private static int longestValid(String s) {

        int maxn=0;

        int []dp =new int[s.length()];
        for(int i=1;i<s.length();i++){
            if(s.charAt(i) == ')'){
                if(s.charAt(i-1)=='(')
                    dp[i]= i-2>=0 ?dp[i-2]+2:2;
                else if(i-dp[i-1] >=0&& s.charAt(i-dp[i-1]-1)=='(')
                    dp[i]=dp[i-1]+ ( (i-dp[i-1]-2)>=2? dp[i-dp[i-1]-2]:0) +2;
            }
            maxn=Math.max(dp[i],maxn);
        }
       return maxn;
    }
}
