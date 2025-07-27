package Lock;

public class ReentrantDemo1 {
    public synchronized void methodA() {
        System.out.println("Method A");
        methodB(); // 同一线程再次获取锁
    }

    public synchronized void methodB() {
        System.out.println("Method B");
    }
}


class Demo{


    public static void main(String[] args) {
        ReentrantDemo1 demo =new ReentrantDemo1();
        demo.methodA();
    }
}