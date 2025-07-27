package Singleton;

import java.lang.reflect.Constructor;

public class Test{
    public static void main(String[] args) throws Exception {
        //使用反射破坏单例
        //获取空参构造方法
        Constructor<Singleton> declaredConstructor = Singleton.class.getDeclaredConstructor(null);
        //设置强制访问
        declaredConstructor.setAccessible(true);
        //创建实例
        Singleton singleton=declaredConstructor.newInstance();
        System.out.println("反射创建的实例"+singleton);

        System.out.println("正常创建的实例"+Singleton.getInstance());
        System.out.println("正常创建的实例"+Singleton.getInstance());

    }
}