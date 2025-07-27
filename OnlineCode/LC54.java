package OnlineCode;

import java.util.ArrayList;
import java.util.List;

public class LC54 {


    public static void main(String[] args) {
        int[][]matrix ={{1,2,3},{4,5,6},{7,8,9}};
        List<Integer> ans = solve(matrix);
        for(int i=0;i<ans.size();i++)
            System.out.print(ans.get(i)+" ");
    }

    private static List<Integer> solve(int[][] matrix) {
        int l=0, r=matrix[0].length-1 ,a=0, b=matrix.length-1;
        List<Integer>list=new ArrayList<>();
        int cnt=l;
        while( l<=r && a<=b){


            while(cnt<=r){
                list.add(matrix[a][cnt++]);
            }a++;
            if(a>b)break;
            cnt=a;
            while(cnt<=b){
                list.add(matrix[cnt++][r]);
            }r--;
            if(r<l)break;
            cnt=r;
            while(cnt>=l){
                list.add(matrix[b][cnt--]);
            }b--;
            if(b<a)break;
            cnt=b;

            while(cnt>=a){
                list.add(matrix[cnt--][l]);
            }l++;
            if(l>r)break;
            cnt=l;


        }
        return  list;

    }
}
