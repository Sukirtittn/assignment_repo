import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Deadlock {

    Lock lock1 = new ReentrantLock(true);
    Lock lock2 = new ReentrantLock(true);

    public void system1(){
        lock1.lock();
        System.out.println("lock 1 system 1");
        lock2.lock();
        System.out.println("lock 2 system 1");
        lock1.unlock();
        lock2.unlock();
    }

    public void system2(){
        lock2.lock();
        System.out.println("lock 1 system 2");
        lock1.lock();
        System.out.println("lock 2 system 2");
        lock2.unlock();
        lock1.unlock();

    }

    public static void main(String[] args) throws InterruptedException {
        Deadlock deadlock = new Deadlock();
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                deadlock.system1();
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                deadlock.system2();
            }
        });
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
    }
}
