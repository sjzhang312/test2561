package OnlineCode;

import java.util.HashMap;
import java.util.HashSet;

public class LC128 {


    public static void main(String[] args) {
        int []nums={100,4,200,1,3,2};
        int ans=longestSeq(nums);
        System.out.println(ans);
    }

    private static int longestSeq(int[] nums) {
        HashSet<Integer>set=new HashSet<>();
        for(int i=0;i<nums.length;i++)
            set.add(nums[i]);
        int maxn=0;
        for(int i:set){
            if(set.contains(i-1))continue;

            int t=i;
            int cnt=0;
            while(set.contains(t)){
                cnt++;
                t++;
                maxn=Math.max(cnt,maxn);
            }
        }
        return maxn;

    }



}
