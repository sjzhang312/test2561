package OnlineCode;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;


public class LC78 {
    public static void main(String[] args) {
        int []nums={1,2,3};
        List<List<Integer>>ans= subsets(nums);
        System.out.println(ans);
    }

    private static  List<List<Integer>> subsets(int[] nums) {

        List<List<Integer >>ans= new ArrayList<>();
        sovle(nums,0,ans);
        return ans;
    }
    private  static  List<Integer> list=new ArrayList<>();
    private static void sovle(int[] nums,int k, List<List<Integer>> ans) {
        if(k== nums.length)return ;


        for(int i=k;i<nums.length ;i++){
            list.add(nums[i]);
            ans.add(new ArrayList<>(list));
            sovle( nums,i+1,ans);
            list.remove( list.size()-1);
        }

    }


}
