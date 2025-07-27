package OnlineCode;

public class LC322 {


    public static void main(String[] args) {
        int [] coins = {1,2,5};
        int amount=11;
        int ans=coinChange(coins,amount);
        System.out.println(ans);
    }

    private static int coinChange(int[] coins, int amount) {

        int []dp =new int[amount+1];
        for(int i=0;i<=amount;i++)
            dp[i]=amount;
        dp[0]=0;

        for(int i=1 ;i<=amount ;i++){

            for(int j=0;j<coins.length;j++){
                if(i>=coins[j]){
                    dp[i]= Math.min(dp[i] ,dp[i-coins[j]]+1 );
                }
            }
        }


        return dp[amount];
    }
}
