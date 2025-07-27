package OnlineCode;

public class LC53 {

    public static void main(String[] args) {
        int []nums= {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(MaxArraySum(nums));
    }

    private static int MaxArraySum(int[] nums) {
        int ans=0;
        int []dp= new int[nums.length];
        if(nums.length==1)return nums[0];
        dp[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            dp[i]=Math.max(nums[i] ,dp[i-1]+nums[i]);
            ans=Math.max(dp[i],ans);
        }

        return ans;
    }
}
