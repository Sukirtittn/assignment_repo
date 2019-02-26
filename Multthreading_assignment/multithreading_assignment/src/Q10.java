class SynchronizedMethod {
    synchronized public void printSquares() {
        System.out.println("Printing squares of numbers 11-15");
        for (int i = 11; i <= 15; i++) {
            System.out.println("Square of "+i+" is "+i * i);
            try {
                Thread.sleep(700);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

class Squares extends Thread {
    SynchronizedMethod synchronizedMethod;

    Squares(SynchronizedMethod synchronizedMethod) {
        this.synchronizedMethod = synchronizedMethod;
    }

    @Override
    public void run() {
        synchronizedMethod.printSquares();
    }
}

public class Q10 {
    public static void main(String[] args) {
        SynchronizedMethod synchronizedMethod = new SynchronizedMethod();
        Squares square1 = new Squares(synchronizedMethod);
        Squares square2 = new Squares(synchronizedMethod);
        square1.start();
        square2.start();
    }
}