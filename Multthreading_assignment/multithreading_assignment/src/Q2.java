public class Q2 extends Thread{
    @Override
    public void run() {
        String str = "Hello Thread 3";
        try {
            Thread.sleep(1000L);
            System.out.println("Running 3rd Thread after a sleep of 1000millis"+str);
            System.out.println("this shows join will work properly only if we havent used sleep method, otherwise it will exexute as per jvm handling");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                    System.out.println("Running 1st Thread");
            }
        });


        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(1000L);
                    System.out.println("Running 2nd Thread after a sleep of 1000millis");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        thread1.start();
        Q2 t3= new Q2();
        t3.start();
        thread2.start();

        thread1.join();
        thread2.join();
        t3.join();

        System.out.println("Main thread ended.....");
    }
}
