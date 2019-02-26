
class ThreadClas1 extends Thread {

    public void run()
    {
        synchronized(this)
        {
            System.out.println( "Thread Started: "+Thread.currentThread().getName());
            try {
                this.wait();
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread Notified: "+Thread.currentThread().getName());
        }
    }
}
class ThreadClas2 extends Thread {

    ThreadClas1 thread1;
    ThreadClas2(ThreadClas1 thread1)
    {
        this.thread1 = thread1;
    }
    public void run()
    {
        synchronized(this.thread1)
        {
            System.out.println( "Thread Started: "+Thread.currentThread().getName());
            this.thread1.notifyAll();
            System.out.println("Thread Notified: "+Thread.currentThread().getName());
        }
    }
}


public class Q13 {
    public static void main(String[] args) throws InterruptedException
    {

        ThreadClas1 thread1 = new ThreadClas1();
        ThreadClas2 thread2 = new ThreadClas2(thread1);

        Thread t1 = new Thread(thread1, "Thread1");
        Thread t2 = new Thread(thread2, "Thread2");
        t1.start();
        Thread.sleep(900);
        t2.start();
    }
}