package Singleton;

//懒汉式
public class Singleton2 {
    //1 私有化构造方法
    private Singleton2() {
    }
    //2 定义一个静态变量指向自己类型
    private static Singleton2 instance;
    //3 对外提供一个公共的方法来获取该对象
    public static Singleton2 getInstance(){
        if(instance==null){
            instance=new Singleton2();
        }
        return instance;
    }
}
