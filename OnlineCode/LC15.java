package OnlineCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LC15 {


    public static void main(String[] args) {

        int []nums={-1,0,1,2,-1,-4};
        threeSum(nums);
    }

    private static void threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans=new ArrayList<List<Integer>>();
        int n=nums.length;
        int second=Integer.MIN_VALUE;
        int third=Integer.MIN_VALUE;
        for (int i = 0; i < n-2; i++) {
            if(i!=0 &&nums[i-1]==nums[i])continue;
            int j = i + 1, k = n - 1;


            while (j < k) {
                List<Integer> list = new ArrayList<>();
                int tmp = nums[i] + nums[j] + nums[k];
                if (tmp == 0 && (second!=nums[j] ||third!=nums[k])) {
                    second=nums[j];third=nums[k];
                    list.add(nums[i]);
                    list.add(nums[j]);
                    list.add(nums[k]);
                    ans.add(list);
                    k--;j++;
                } else if (tmp > 0) k--;
                else j++;
            }


        }
        System.out.println(ans);
        for(int i=0;i<ans.size();i++){
            for(int j=0;j<ans.get(0).size() ;j++){
                System.out.print(ans.get(i).get(j)+" ");
            }
            System.out.println();
        }


    }
}
