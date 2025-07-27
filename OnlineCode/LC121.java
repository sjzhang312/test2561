package OnlineCode;

public class LC121 {
    public static void main(String[] args) {


        int []nums= {7,1,5,3,6,4};
        System.out.println(maxProfit(nums));
    }

    private static int maxProfit(int[] nums) {

        int n=nums.length;
        if(n==1)return nums[0];
        int minn=nums[0];
        int []dp=new int[n];
        int ans=0;
        for(int i=1;i<n;i++){
            if(nums[i]>minn){
                dp[i]=nums[i]-minn;
                ans=Math.max(dp[i],ans);
            }
            minn=Math.min(nums[i] ,minn);
        }
        return ans;

    }
}
