import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
public class Q16 {

    Lock lock1 = new ReentrantLock(true);
    Lock lock2 = new ReentrantLock(true);

    public void acquireLock(Lock lock1, Lock lock2) {

        boolean acquireLock1 = lock1.tryLock();
        boolean acquireLock2 = lock2.tryLock();

        if (acquireLock1 && acquireLock2) {
            System.out.println("locks aquired");
            return;
        }

        if (acquireLock1) {
            System.out.println("lock1 released");
            lock1.unlock();
        }

        if (acquireLock2) {
            System.out.println("lock2 released");
            lock2.unlock();
        }

    }

    public void system1() {
        acquireLock(lock1, lock2);
        System.out.println("lock 1 system1");
        System.out.println("lock 2 system1");
        lock2.unlock();
        lock1.unlock();
    }
    public void system2() {
        acquireLock(lock2, lock1);
        System.out.println("lock 1 system 2");
        System.out.println("lock 2 system 2");
        lock1.unlock();
        lock2.unlock();
    }

    public static void main(String[] args) throws InterruptedException {
        Q16 q16 = new Q16();
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                q16.system1();
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                q16.system2();
            }
        });
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
    }

}