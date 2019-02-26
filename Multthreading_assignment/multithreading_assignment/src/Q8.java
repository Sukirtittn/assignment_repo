import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Q8 {
    public static void main(String[] args) {
        ScheduledExecutorService executorService = Executors.newSingleThreadScheduledExecutor();
        executorService.schedule(new Runnable() {
            @Override
            public void run() {
                System.out.println("here time delay is 1 sec so task will be executed by 1 second");
                              }
                          },1, TimeUnit.SECONDS);

        executorService.scheduleWithFixedDelay(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(2000L);
                    System.out.println("Scheduled Task to executed after fixed intervalrate");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        }, 0, 1, TimeUnit.SECONDS);

        executorService.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(2000L);
                    System.out.println("Scheduled Task to executed after fixed interval");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, 0, 1, TimeUnit.SECONDS);
    }
}

