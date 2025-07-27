package OnlineCode;

public class LC42 {

    public static void main(String[] args) {
        int []height={0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trap(height));
    }

    private static int trap(int[] height) {
        int n=height.length;
        if(n==1)return 0;
        int maxn=height[0];
        int []left=new int[n];
        int []right=new int[n];
        for(int i=0;i<n;i++){
            left[i]= Math.max(height[i] ,maxn);
            maxn=Math.max(left[i] ,maxn);
        }
        maxn=height[n-1];
        int ans=0;
        for(int i=n-1;i>=0;i--){
            right[i]=Math.max(height[i] ,maxn);
            maxn=Math.max( maxn,  right[i]);
        }



        for(int i=0;i<n;i++){
            int tmp=Math.min(left[i] ,right[i]);
            if(height[i]<tmp){
                ans+=(tmp - height[i]);
            }
        }
        return ans;

    }


}
