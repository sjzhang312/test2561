package OnlineCode;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LC56 {


    public static void main(String[] args) {
        int [][]intervals={{1,3},{2,6},{8,10},{15,18}};
        int [][]ans = mergeIntervals(intervals);
        for(int i=0;i<ans.length;i++){
            for(int j=0;j< ans[i].length;j++)
                System.out.print( ans[i][j] +" ");
        }
    }

    private static int[][] mergeIntervals(int[][] intervals) {
        //默认是按照什么排序的
        //Arrays.sort(intervals );
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0]-o2[0];
            }
        });
        List<int[]> list=new ArrayList<>();
        for(int i=0;i<intervals.length;i++){
            int l = intervals[i][0], r = intervals[i][1];
            if(list.isEmpty() || list.get(list.size()-1)[1]<l ){
                list.add(new int[]{l,r});
            }else {
                int tmpl=list.get(list.size()-1)[0];
                list.remove(list.size()-1);
                list.add( new int[]{tmpl, r});
            }
        }
        //return list.toArray(new int[][]{});
        return list.toArray(new int[list.size()][]);



    }
}
