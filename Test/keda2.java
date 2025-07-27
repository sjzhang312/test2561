package qiuzhao;

import java.util.*;

public class keda2 {
    static class Term {
        long val; // 2^a * 3^b 的值
        int a;    // 2 的幂次
        int b;    // 3 的幂次

        Term(long val, int a, int b) {
            this.val = val;
            this.a = a;
            this.b = b;
        }
    }

    static void solve(long n) {
        // 存储所有可能的 2^a * 3^b 项
        List<Term> terms = new ArrayList<>();

        // 生成所有可能的项，限制范围为 2^a * 3^b <= n
        for (int a = 0; a <= 30; a++) {
            long pow2 = 1L << a; // 2^a
            if (pow2 > n) break;
            for (int b = 0; b <= 19; b++) {
                long val = pow2 * (long)Math.pow(3, b); // 2^a * 3^b
                if (val > n) break;
                terms.add(new Term(val, a, b));
            }
        }

        // 按值从大到小排序，若值相等则按 b 从小到大排序
        Collections.sort(terms, new Comparator<Term>() {
            @Override
            public int compare(Term x, Term y) {
                if (x.val != y.val) return Long.compare(y.val, x.val); // 值从大到小
                return Integer.compare(x.b, y.b); // b 从小到大
            }
        });

        // 贪心选择
        List<Long> selected = new ArrayList<>();
        long remain = n;
        for (Term t : terms) {
            if (t.val <= remain) {
                selected.add(t.val);
                remain -= t.val;
            }
            if (remain == 0) break;
        }

        // 如果 remain != 0，则说明无法分解（但题目保证一定可行）
        assert remain == 0;

        // 输出结果
        System.out.println(selected.size());
        for (int i = 0; i < selected.size(); i++) {
            System.out.print(selected.get(i));
            if (i < selected.size() - 1) System.out.print(" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int t = 0; t < T; t++) {
            long n = sc.nextLong();
            solve(n);
        }
        sc.close();
    }
}
