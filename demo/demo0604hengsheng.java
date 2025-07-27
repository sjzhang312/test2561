package demo;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class demo0604hengsheng {
    public static int gcd(int a,int b){
        int minn=Math.min(a,b);
        //double t=Math.sqrt(minn);
        int t=minn; //强转
        while(t!=1){
            if(a%t==0 && b%t==0)
                return t;
            t--;
        }

        return 1;

    }
    public static void main(String[] args) {
        //Scanner in = new Scanner(System.in);
        //// 注意 hasNext 和 hasNextLine 的区别
        //int n=in.nextInt();
        //int k=in.nextInt();
        //if(n==1){
        //    System.out.println(-1);
        //    return ;
        //}
        //int []nums=new int[n];
        //for(int i=0;i<n;i++)nums[i]=in.nextInt();
        //int maxnn=-1;
        //int sum=nums[0],t=0;
        //for(int i=0;i<n-1;i++){
        //    sum+=nums[i+1];
        //    if(sum<=k)
        //        t=t+gcd(nums[i],nums[i+1]);
        //    else{
        //        t=gcd(nums[i],nums[i+1]);
        //    }
        //    maxnn=Math.max(maxnn,t);
        //}
        //System.out.println(maxnn);

        //float a= 1.0F;
        int b=1;
        long d=1L;
        double c=1.5;
        int e=(int)c;
        System.out.println(e);

    }
}