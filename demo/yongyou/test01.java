package demo.yongyou;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class test01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] nums = new int[50000];
        int cnt = 0;
        for (int i = 0; i < m; i++) {
            int p, q;
            p = in.nextInt();
            q = in.nextInt();

            if (nums[p] != 0 || nums[q] != 0)
                cnt++;
            nums[p] = 1;
            nums[q] = 1;

        }
        //System.out.println(cnt);
        cnt = m - cnt - 1;
        //System.out.println(cnt);

        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) cnt++;
        }
        System.out.println(cnt);

    }
}
/**
 * 10 3
 * 1 2
 * 2 1
 * 3 1
 */