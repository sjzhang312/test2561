package dewu;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class code03 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        int H=sc.nextInt();
        int ans=0;
        int [][]nums=new int[H][5];
        for(int i=0;i<H;i++){
            for(int j=0;j<5;j++){
                nums[i][j]=sc.nextInt();
            }
        }

        for(int i=0;i<H;i++){
            int cnt=1;
            for(int j=1;j<5;j++){
                if(nums[i][j]==nums[i][j-1])cnt++;
                if(cnt==3)ans+=nums[i][j]*3;
                else if(cnt>3)ans+=nums[i][j];
            }
        }
        System.out.println(ans);
    }

}
