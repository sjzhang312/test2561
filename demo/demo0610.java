package demo;

import java.util.concurrent.locks.ReentrantLock;

public class demo0610 {
}


class ParamTest{
    public int member=0;

    public static void main(String[] args) {
        int param1=0;
        String param5="abc";
        ParamTest param2=new ParamTest();
        ParamTest param3=new ParamTest();
        int []param4= {0};
        chanageParam(param1,param2,param3,param4,param5);
        System.out.println(param1+","+param2.member+","+param3.member+","+param4[0]+","+param5);
    }

    private static void chanageParam(int param1, ParamTest param2, ParamTest param3, int[] param4,String param5) {
        param1=1;
        param2.member=1;
        param3=new ParamTest();
        param3.member=1;
        param4[0]=1;
        param5="dce";
    }
    ReentrantLock reentrantLock=new ReentrantLock();

}
