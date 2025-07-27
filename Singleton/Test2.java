package Singleton;

public class Test2 {
    public static void main(String[] args) {
        for(int i=0;i<20 ;i++){
            new Thread(()->{
                System.out.println("多线程创建的单例:"+Singleton2.getInstance());
            }).start();
        }
    }
}
