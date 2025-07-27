package OnlineCode;

public class LC72 {


    public static void main(String[] args) {
        String s1="horse";
        String s2="ros";
        int ans=minDistance(s1,s2);
        System.out.println(ans);
    }

    private static int minDistance(String s1, String s2) {

        int m=s1.length();
        int n=s2.length();
        if(m*n == 0)return m+n;
        int [][]dp=new int[m+1][n+1];
        for(int i=0;i<=m ;i++)
            dp[i][0]=i;
        for(int j=0;j<=n;j++)
            dp[0][j]=j;

        for(int i=1;i<=m ;i++){
            for(int j=1;j<=n;j++){

                int l= dp[i][j-1]+1;
                int u= dp[i-1][j]+1;
                int l_u;
                if(s1.charAt(i-1) ==s2.charAt(j-1))
                    l_u=dp[i-1][j-1];
                else l_u=dp[i-1][j-1]+1;

                dp[i][j]=Math.min(Math.min( l,u) , l_u) ;

            }
        }
        return dp[m][n];

    }

}
