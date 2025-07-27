package OnlineCode;

import java.util.HashMap;
import java.util.Map;

public class LC219 {


    public static void main(String[] args) {
        int []nums={1,2,3,1,2,3};
        int k=2;
        boolean ans=containsNearbyDuplicate(nums,k);
        System.out.println(ans);
    }

    private static boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer,Integer> map=new HashMap<>();
        boolean flag=false;
        for(int i=0;i<nums.length;i++){
            if(!map.containsKey(nums[i]) ){
                map.put(nums[i],i);
            }else{
                if(i -map.get(nums[i]) >k){
                    flag=false;
                    map.put(nums[i],i);
                }else flag=true;
            }
        }
        return flag;
    }
}
