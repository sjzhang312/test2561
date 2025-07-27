package OnlineCode;

import java.util.Random;

public class LC912 {


    public static void main(String[] args) {

        int[] nums={5,2,3,1};
        int []ans= quickSort(nums);
        for(int i=0;i<ans.length;i++) System.out.println(ans[i]+" ");
    }

    private static int [] quickSort(int[] nums) {

        quickSortArray(nums,0,nums.length-1);
        return nums;

    }

    private static void quickSortArray(int[] nums, int l, int r) {
        if( l<r){
            int pivot= fun(nums,l,r);
            quickSortArray(nums,l,pivot-1);
            quickSortArray(nums,pivot+1,r);
        }

    }

    private static int fun(int []nums,int l,int r){
        int pivot=nums[l];

        while(l<r){
            while(l<r && nums[r]>=pivot )r--;
            nums[l]=nums[r];
            while(l<r && nums[l]<=pivot)l++;
            nums[r]=nums[l];
        }
        nums[l]=pivot;
        return l;

    }
}
