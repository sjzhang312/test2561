package OnlineCode;

public class LC33 {


    public static void main(String[] args) {
        int []nums= {1,3,5};
        System.out.println(search(nums,3));
    }

    private static int search(int[] nums, int target) {

        int l =0,r=nums.length-1;
        while(l<r){
            int mid= (l+r)/2;
            if(nums[mid]>=nums[l] && (nums[mid] >=target && nums[l]<=target)){
                r=mid;
            }
            else l=mid+1;

            System.out.println(l+" "+r);

        }
        //System.out.println(l);
        if(nums[l]!=target)return -1;
        return l;
    }
}
