package OnlineCode.xf;

import java.util.Arrays;
import java.util.Scanner;

public class xf01 {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int []nums= new int[n];
        for(int i=0;i<n;i++)
            nums[i]=in.nextInt();
        solve(nums,n);
    }

    private static void solve(int[] nums, int n) {
        Arrays.sort(nums);

        //for(int i=0;i<n;i++){
        //    System.out.print(nums[i]+" ");
        //}
        int i,j;
        if(n%2==0){
            i=n/2-1;
            j=n/2;
            while (i>=0 && j<n){
                System.out.print(nums[i]+" ");
                System.out.print(nums[j]+" ");
                i--;
                j++;
            }
        }else {
            i=n/2-1;
            j=n/2;
            while(i>=0 && j<n){
                System.out.print(nums[j]+" ");
                System.out.print(nums[i]+" ");

                i--;
                j++;
            }
            System.out.println(nums[j]);
        }

    }
}
