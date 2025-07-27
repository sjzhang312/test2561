package OnlineCode;

public class LC165 {


    public static void main(String[] args) {
        String s1="1.2";
        String s2="1.10";
        //String[] split = s1.split("\\.");
        //for(int i=0;i<split.length;i++) System.out.println(split[i]);
        int ans=compareVersion(s1,s2);
        System.out.println(ans);
        System.out.println(compareVersion("1.01","1.001"));
        System.out.println(compareVersion("1","1.0.1"));
    }

    private static int compareVersion(String s1, String s2) {
        String[] split1 = s1.split("\\.");
        String[] split2 = s2.split("\\.");
        int i=0,j=0;
        int ans=0;
        while(ans ==0 && i< split1.length && j<split2.length){
            ans=solve(split1[i] ,split2[j]);

            i++;
            j++;
        }
        while( ans==0&& i < split1.length){
            ans=solve(split1[i],"");
            i++;
        }
        while(ans==0&& j<split2.length ){
            ans=solve("",split2[j]);
            j++;
        }

        return ans;

    }
    private static int solve(String x,String y){
        int i= !x.isEmpty()?  Integer.parseInt(x):0;

        //int i= fun(x);
        int j= !y.isEmpty() ? Integer.parseInt(y):0;

        if( i<j)return -1;
        if(i>j)return 1;
        return 0;

    }


}
