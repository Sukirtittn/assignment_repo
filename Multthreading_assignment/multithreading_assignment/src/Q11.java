public class Q11 {
    public static void main(String args[]) {
        SyncBlockExample synchronizeBlock = new SyncBlockExample();
        Thread1 t1 = new Thread1(synchronizeBlock);
        Thread2 t2 = new Thread2(synchronizeBlock);
        t1.start();
        t2.start();
    }
}
class SyncBlockExample {
    void printMessage(String string) {
        System.out.println("Firstly thread1 then thread 2 should be executed as we are using syncronized block");
        synchronized (this) {
            System.out.println("Synchronized msg:" + string);
        }
    }

}
class Thread1 extends Thread {


    SyncBlockExample synchronizeBlock;

    Thread1(SyncBlockExample synchronizeBlock) {
        this.synchronizeBlock = synchronizeBlock;
    }

    public void run() {
        synchronizeBlock.printMessage("Sukirti Thread 1");
    }

}
class Thread2 extends Thread {

    SyncBlockExample syncBlockExObj;

    Thread2(SyncBlockExample synchronizeBlock) {
        this.syncBlockExObj = synchronizeBlock;
    }
    public void run() {
        syncBlockExObj.printMessage("Kaushik Thread2");
    }

}


