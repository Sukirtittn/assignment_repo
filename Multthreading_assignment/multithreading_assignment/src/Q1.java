public class Q1 implements Runnable {
    @Override
    public void run() {
        String str = "Hello multithreading";
        System.out.println("Creating thread by implementing Runnable interface: " + str);
    }

    public static void main(String[] args) {
        new Thread(new Q1()).start();
    }
}
//public class Q1 extends Thread {
//    @Override
//    public void run() {
//        String str = "Hello multithreading";
//        System.out.println("Creating thread by extending Thread Class: " + str);
//    }
//
//    public static void main(String[] args) {
//        new Q1().start();
//    }
//}

