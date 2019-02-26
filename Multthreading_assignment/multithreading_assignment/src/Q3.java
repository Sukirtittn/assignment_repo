import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Q3 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        try {
            executorService.submit(new Runnable() {
                @Override
                public void run() {
                    System.out.println("Thread1");
                    System.out.println("Executor service single thread:" +
                            " where submit method is used to execute executor service!");
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
        } finally {
            System.out.println("Asking system to shutdown");
            executorService.shutdown();
        }
        System.out.println(executorService.isShutdown());
        System.out.println(executorService.isTerminated());
    }
}
