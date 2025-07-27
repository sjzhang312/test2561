public class quickSort {

    public static int  partition(int []nums,int left,int right){

        int pivot=nums[left];
        int i=left,j=right;
        while(left<right){

            while(left<right && nums[right]>=pivot){
                right--;
            }
            nums[left]=nums[right];
            while(left<right && nums[left]<=pivot){
                left++;
            }
            nums[right]=nums[left];

        }
        nums[left]=pivot;

        return left;
    }


    public static void sortSort(int []nums ,int left,int right){
        if(left<right){
            int partition = partition(nums,left,right);
            sortSort(nums,left,partition-1);
            sortSort(nums,partition+1,right);
        }


    }

    public static void main(String args[]){

        int [] nums={32,54,11,78,9,62,99};
        int n=nums.length;
        sortSort(nums,0,n-1);
        for(int i=0;i<n;i++){
            System.out.print(nums[i]+" ");
        }
    }
}
