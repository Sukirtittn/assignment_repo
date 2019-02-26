class ThreadClass1 extends Thread {
    public void run()
    {
        synchronized(this)
        {
            System.out.println( "thread started: "+Thread.currentThread().getName());
            try {
                this.wait();
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread notified: "+Thread.currentThread().getName());
        }
    }
}
class ThreadClass2 extends Thread {
    ThreadClass1 thread1;
    ThreadClass2(ThreadClass1 thread1)
    {
        this.thread1 = thread1;
    }
    public void run()
    {
        synchronized(this.thread1)
        {
            System.out.println("Name of Thread started: "+Thread.currentThread().getName());

            try {
                this.thread1.wait();
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Name of Thread notified: "+Thread.currentThread().getName());

        }
    }
}
class ThreadClass3 extends Thread {
    ThreadClass1 thread1;
    ThreadClass3(ThreadClass1 thread1)
    {
        this.thread1 = thread1;
    }
    public void run()
    {
        synchronized(this.thread1)
        {
            System.out.println( "thread started: "+Thread.currentThread().getName());

            this.thread1.notifyAll();
            System.out.println("Thread notified: "+Thread.currentThread().getName());

        }
    }
}

class ThreadClass4 extends Thread {
    ThreadClass1 thread1;
    ThreadClass4(ThreadClass1 thread1)
    {
        this.thread1 = thread1;
    }
    public void run()
    {
        synchronized(this.thread1)
        {
            System.out.println( "thread started: "+Thread.currentThread().getName());

            this.thread1.notifyAll();
            System.out.println("Thread notified: "+Thread.currentThread().getName());

        }
    }
}

public class Q14 {
    public static void main(String[] args) throws InterruptedException
    {

        ThreadClass1 thread1 = new ThreadClass1();
        ThreadClass2 thread2 = new ThreadClass2(thread1);
        ThreadClass3 thread3 = new ThreadClass3(thread1);
        ThreadClass4 thread4 = new ThreadClass4(thread1);
        Thread t1 = new Thread(thread1, "Thread1");
        Thread t2 = new Thread(thread2, "Thread2");
        Thread t3 = new Thread(thread3, "Thread3");
        Thread t4 = new Thread(thread4, "Thread4");
        t1.start();
        t2.start();
        Thread.sleep(900);
        t3.start();
        t4.start();
    }
}