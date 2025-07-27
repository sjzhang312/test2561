package OnlineCode.jd;


import java.util.Scanner;

/**
 *  24年秋招第2批  1、差距管理
 */
public class demo01 {

    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int n=in.nextInt();
        int k=in.nextInt();
        int []nums =new int[n];
        int maxn=Integer.MAX_VALUE;
        int minn=Integer.MIN_VALUE;
        int cnt=0;
        for(int i=0;i<nums.length;i++){
            nums[i]=in.nextInt();
            if(i==0){
                cnt++;
                maxn= nums[i];
                minn=nums[i];
            }else {
                maxn=Math.max(nums[i],maxn);
                minn=Math.min(nums[i],minn);
                if(maxn-minn>k){
                    cnt++;
                    maxn= nums[i];
                    minn=nums[i];
                }
            }

        }
        System.out.println(cnt);

    }
}
