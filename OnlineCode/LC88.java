package OnlineCode;

public class LC88 {


    public static void main(String[] args) {
        int []nums1={1,2,3,0,0,0};
        int []nums2={2,5,6};
        merge(nums1,nums2,3,nums2.length);
        for(int i=0;i< nums1.length;i++) System.out.print(nums1[i]+" ");
    }

    private static void merge(int[] nums1, int[] nums2,int m, int n) {

        int[]nums=new int[m];
        for(int i=0;i<m;i++)nums[i]=nums1[i];

        int i=0,j=0;
        int cnt=0;
        while(i < m && j<n){
                if(nums[i]<=nums2[j]){
                    nums1[cnt]=nums[i];
                    i++;
                }else {
                    nums1[cnt]=nums2[j];
                    j++;
                }

                cnt++;
        }
        while(i<m){
            nums1[cnt]=nums[i];
            i++;
            cnt++;
        }
        while(j<n){
            nums1[cnt]=nums2[j];
            j++;
            cnt++;
        }

    }
}
