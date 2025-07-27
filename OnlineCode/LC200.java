package OnlineCode;

public class LC200 {


    public static void main(String[] args) {
        char[][]grid={
                {'1','1','1','1','0'},
                {'1','1','0','1','0'},
                {'1','1','0','0','0'},
                {'0','0','0','0','0'}
        };
        System.out.println(numIsland(grid));
    }

    private static int numIsland(char[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        boolean [][] flag= new boolean[m][n];
        //for(int i=0;i<m;i++){
        //    for(int j=0;j<n;j++) System.out.println(flag[i][j]);
        //}
        int cnt=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++) {
                if(flag[i][j]==false && grid[i][j]=='1'){
                    //System.out.println(flag[i][j]);
                    cnt++;
                    dfs(i,j,grid,flag);

                }
            }
        }
        return cnt;
    }

    private static void dfs(int i, int j,char[][] grid,boolean[][] flag) {
        int m=grid.length;
        int n=grid[0].length;
        if(  i== m || i<0 || j==n|| j<0|| flag[i][j]==true ||grid[i][j]=='0' )return ;
        flag[i][j]=true;


            dfs(i,j+1,grid,flag);

            dfs(i+1,j,grid,flag);

            dfs(i,j-1,grid,flag);

            dfs(i-1,j,grid,flag);


    }
}
