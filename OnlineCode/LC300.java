package OnlineCode;

public class LC300 {
    public static void main(String[] args) {
        int []nums={0,1,0,3,2,3};

        System.out.println(maxLongestnum(nums) );
    }

    private static int  maxLongestnum(int[] nums) {
        int n=nums.length;
        int []dp =new int[n]; //以下标i为结尾的最长递增子序列长度为do[i]
        int ans=0;
        if(n==1)return 1;
        //dp[0]= nums[0];
        for(int i=0;i<n;i++)dp[i]=1;
        int maxn=1;
        for(int i=1;i<n;i++){
            for(int j=0;j<i;j++){
                if(nums[i] >nums[j]){
                    dp[i]=Math.max(dp[j]+1,dp[i]);
                    maxn=Math.max(dp[i],maxn);
                }
            }
        }

        return maxn;
    }
}
