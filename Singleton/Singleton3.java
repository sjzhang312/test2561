package Singleton;

public class Singleton3 {
    private static volatile Singleton3 instance;

    private Singleton3() {}

    public static Singleton3 getInstance() {
        if (instance == null) { // 第一次检查（无锁）
            synchronized (Singleton3.class) { // 锁 Class 对象
                if (instance == null) { // 第二次检查（有锁）
                    instance = new Singleton3();
                }
            }
        }
        return instance;
    }
}
