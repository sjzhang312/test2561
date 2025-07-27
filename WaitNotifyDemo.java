public class WaitNotifyDemo {
    public static void main(String[] args) {
        Object lock =new Object();
        new Thread(()->{
            synchronized (lock){
                System.out.println("线程1：我要wait");
                try{
                    lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("线程1：我被唤醒了");
            }
        }).start();

        new Thread(()->{
            synchronized (lock){
                System.out.println("线程2：我要唤醒");
                lock.notify();
                System.out.println("线程2：我已经唤醒了");
            }
        }).start();
    }
}
