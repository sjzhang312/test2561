package demo;

import java.util.Scanner;

public class zouyebang01 {
}


// 注意类名必须为 Main, 不要有任何 package xxx 信息
class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String url=in.next();
        String type=in.next();
        String ans="";
        for(int i=0;i<url.length();i++){
            int j=0;
            if(url.charAt(i)==type.charAt(j)){
                while(j<type.length()&& url.charAt(i+j)==type.charAt(j) ){

                    j++;
                }
                //System.out.println(j);
                if( url.charAt(i+j)=='='&& j==type.length()){
                    j++;

                    //System.out.println(url.charAt(i+j));
                    while(url.charAt(i+j) >='0'&& url.charAt(i+j)<='9'){
                        ans+=url.charAt(i+j);
                        j++;
                        if(i+j>url.length())break;
                    }
                    break;
                }

            }


        }

        System.out.println(ans);
    }
}