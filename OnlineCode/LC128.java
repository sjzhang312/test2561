package OnlineCode;

import java.util.HashMap;
import java.util.HashSet;

public class LC128 {


    public static void main(String[] args) {
        int []nums={0,3,7,2,5,8,4,6,0,1};
        int ans=longestSeq(nums);
        System.out.println(ans);
    }

    private static int longestSeq(int[] nums) {

        HashSet<Integer> set=new HashSet<>();
        for(int i:nums){
            set.add(i);
        }
        int ans=0;
        for(int i:set){
            int cnt=i;
            //int j=0;
            while(set.contains(cnt)){
                cnt++;
                //j++;
            }
            ans=Math.max(cnt-i,ans);

        }
        return ans;
    }



}
