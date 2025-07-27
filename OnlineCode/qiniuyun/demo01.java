package OnlineCode.qiniuyun;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class demo01 {

    public boolean isValidString (String s) {
        // write code here
        Queue<Character> q1 = new ArrayDeque<>();
        Queue<Character> q2 = new ArrayDeque<>();
        int cnt = 0;
        // for (int i = 0; i < s.length(); i++) {
        //     if (s.charAt(i) == '(') {
        //         q1.add('(');
        //     } else if (s.charAt(i) == ')') {
        //         q2.add(')');
        //     } else cnt++;

        //     // if(q2.size()== s.length()/2 && q1.size()!= s.length()/2)
        //     // return false;
        // }
        // int m = q1.size(), n = q2.size();
        // if (m == n )return true;
        // else if ( m + cnt == n)return true;
        // else if (n + cnt == m)return true;
        // return false;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                q1.add('(');
            } else if (s.charAt(i) == ')') {
                if (q1.size() == 0) {
                    if (cnt > 0) {
                        cnt--;
                        continue;
                    } else
                        return false;
                }
                q1.remove();
            } else cnt++;
        }
        if (!q1.isEmpty()) {
            while (cnt > 0) {
                q1.remove();
                cnt--;
            }
        }

        return q1.isEmpty();
    }
}
