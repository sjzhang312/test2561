package anythread;

import org.w3c.dom.ls.LSOutput;

import java.util.concurrent.CountDownLatch;

public class Acount {

    int id;
    int money;
    Acount(){}
    Acount(int id,int money){
        this.id=id;
        this.money=money;
    }
    public int  getMoney(){
        return this.money;
    }
    public void setMoney(int money){
        this.money=money;
    }
    public synchronized  void transfer(Acount to,int m){
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        //synchronized (to){
        //    if(this.money< m)return ;// 钱不够
        //    //转账
        //    this.money-=m;
        //    to.money+=m;
        //}
        if(this.money< m)return ;// 钱不够
        //转账
        this.money-=m;
        to.money+=m;
    }


}


class demo07{
    public static void main(String[] args) throws InterruptedException {
        Acount a1=new Acount(1,1000);
        Acount a2=new Acount(2,1500);
        Acount a3=new Acount(3,300);
        CountDownLatch latch =new CountDownLatch(2);
        Runnable task1= new Runnable() {
            @Override
            public void run() {
                a1.transfer(a2,500);
                latch.countDown();
            }

        };
        Runnable task2=new Runnable() {
            @Override
            public void run() {
                a2.transfer(a1,200);
                latch.countDown();
            }
        };

        Thread thread1 = new Thread(task1);
        Thread thread2= new Thread(task2);

        thread1.start();

        thread2.start();
        latch.await();
        System.out.println(a1.getMoney());
        System.out.println(a2.getMoney());
        System.out.println(a3.getMoney());
    }
}