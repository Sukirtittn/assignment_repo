import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Q4_5 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        try {
            executorService.submit(new Runnable() {
                @Override
                public void run() {
                    System.out.println("Thread1");
                }
            });

            executorService.submit(new Runnable() {
                @Override
                public void run() {
                    System.out.println("Thread2");
                }
            });


            executorService.submit(new Runnable() {
                @Override
                public void run() {
                    System.out.println("Thread3");
                }
            });

            executorService.submit(new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(10000);
                        System.out.println("Thread4");
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }

            });

        } catch (Exception e) {
            e.printStackTrace();
        }
            System.out.println("Asking system to shutdown");
        executorService.shutdownNow();
        System.out.println("shutdown called? "+executorService.isShutdown());
        System.out.println("terminated after shutdownNow?:"+executorService.isTerminated());
    }
}

