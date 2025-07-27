package demo;

public class SynchronizedDemo {
        public void method() {
            synchronized (this) {
                System.out.println("synchronized dcode");
            }
        }
    }