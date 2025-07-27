package OnlineCode.qiniuyun;

import java.util.Random;
import java.util.Scanner;

public class demo02 {

    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int T= in.nextInt();
        for(int i=0;i<T;i++){
            int n= in.nextInt();
            int []nums =new int[n];
            int cnt=0;
            for(int j=0;j<nums.length;j++){
                nums[j] = in.nextInt();
                if(nums[j]!=0)cnt++;
            }
            if(cnt!=nums.length) {
                System.out.println("woman");
                //return ;
            }

            System.out.println("man");
            System.out.println();
        }
    }
}
