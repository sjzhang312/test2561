package OnlineCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class lC18 {


    public static void main(String[] args) {
        int []nums={1,0,-1,0,-2,2};
        int []nums1={2,2,2,2,2};
        List<List<Integer>>ans=fourSum(nums1,8);
        System.out.println(ans);

    }

    private static List<List<Integer>> fourSum(int[] nums,int target) {
        List<List<Integer>>ans=new ArrayList<>();
        Arrays.sort(nums);
        int third=Integer.MAX_VALUE,forth=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){

                List<Integer> list=new ArrayList<>();
                int l=j+1,r=nums.length-1;

                while(l<r){
                    int tmp= nums[i]+nums[j]+nums[l]+nums[r];
                    if(tmp>target)
                        r--;
                    else if(tmp<target)l++;
                    else {
                    if(nums[l]!=third || nums[r]!=forth){
                            list.add(nums[i]);
                            list.add(nums[j]);
                            list.add(nums[l]);
                            list.add(nums[r]);
                            third=nums[l];
                            forth=nums[r];
                            ans.add(list);

                        }
                        l++;
                        r--;

                    }
                }
            }
        }
        return ans;
    }
}
