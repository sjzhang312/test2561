
package Singleton;

class Singleton{
    private Singleton(){}

    private static  Singleton instance= new Singleton();

    public static Singleton getInstance(){
        return  instance;
    }

}

class Singleton1{

    private Singleton1(){};
    private static Singleton1 instance1;
    public static Singleton1 getInstance(){
        if(instance1==null)
            return new Singleton1();
        return instance1;
    }

}

class SingletonLock{
    private SingletonLock(){}
    private static volatile SingletonLock instanceLock;
    public static SingletonLock getInstance(){
        if(instanceLock==null){
            synchronized (SingletonLock.class){
                if(instanceLock==null)
                    return new SingletonLock();
            }
        }
        return instanceLock;
    }
}