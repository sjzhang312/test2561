package demo;

import java.util.Scanner;

public class demo0421 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int m =sc.nextInt();
        int n=sc.nextInt();
        int cnt=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();


        char [][] a=new char[m][n];
        StringBuilder s1=new StringBuilder();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                a[i][j]=sc.next().charAt(0);
                s1.append(a[i][j]);
            }
        }
        StringBuilder tmp=s1,ans=new StringBuilder();
        int mod=cnt%(m*n);
        for(int i=mod;i<m*n ;i++){
            ans.append(s1.charAt(i));
        }
        for(int i=0;i<mod;i++){
            ans.append(s1.charAt(i));
        }
        System.out.println(ans);
        System.out.println(ans.charAt((b-1)*c +c) );

        //for(int i=0;i<m;i++){
        //    for(int j=0;j<n;j++){
        //        System.out.print(a[i][j]+" ");
        //    }
        //}

    }
}
