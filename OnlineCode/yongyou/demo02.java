package OnlineCode.yongyou;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class demo02 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        int maxn=0;
        Queue<Character> queue =new LinkedList<>();
        int t=0;
        int cnt=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '0'){
                queue.add(s.charAt(i));
            }else{
                if(queue.isEmpty()){
                    cnt=0;
                    continue;
                }
                else{
                    t++;
                    if(t==queue.size()){
                        cnt=cnt+ (t*2);
                        maxn=Math.max(cnt,maxn);
                        queue.clear();
                        t=0;
                    }
                }
            }

        }
        System.out.println(maxn);
    }
}
