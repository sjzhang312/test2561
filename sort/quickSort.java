package sort;

public class quickSort {

    static int  partition(int []nums,int n,int l ,int r){
        int pivot=nums[l];
        while(l<r){
            while(l<r && nums[r]>= pivot)r--;
            nums[l]=nums[r];
            while(l<r && nums[l]<=pivot)l++;
            nums[r]=nums[l];
        }
        nums[l]=pivot;
        return l;
    }
    public static void quickSort(int []nums,int n,int l,int r){

           if(l<r){
               int pirvot=partition(nums,n,l,r);
               quickSort(nums,n,l,pirvot);
               quickSort(nums,n,pirvot+1,r);
           }

    }
    public static void main(String[] args) {
        int []nums={7,2,6,9,5,1};
        for(int i=0;i<nums.length;i++)
            System.out.print(nums[i]+" ");
        System.out.println();
        quickSort(nums,nums.length,0,nums.length-1);

        for(int i=0;i<nums.length;i++)
            System.out.print(nums[i]+" ");
    }
}
