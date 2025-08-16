package OnlineCode;

import java.util.ArrayList;
import java.util.List;

public class LC46 {


    public static void main(String[] args) {
        int []nums={1,2,3};

        List<List<Integer>> ans =allRank(nums);
        System.out.println(ans);
    }

    private static List<List<Integer>> allRank(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        //int []flag=new int[nums.length];
        boolean []flag = new boolean[nums.length];

        dfs(nums,ans,flag);
        return ans;
    }
    private static List<Integer>list=new ArrayList<>();
    private static void dfs( int []nums, List<List<Integer>> ans,  boolean [] flag){
        if(list.size()== nums.length){
            ans.add(new ArrayList<>(list));
            return;
        }
        for(int i=0;i< nums.length ;i++){
            if( flag[i] == false){
                flag[i]=true;
                list.add(nums[i]);
                dfs(nums, ans ,flag);
                list.remove(list.size()-1);
                flag[i]=false;
            }
        }

    }

}
