package learnThread.createThread.secureThread;

/**
 * @author Eila juutilainen
 * @create 2021-12-03-03 15:16
 */
class window2 extends Thread {
    private static int ticket = 100;
    private static Object obj = new Object();

    @Override
    public void run() {
        while (true) {

            synchronized (Window2.class) {//synchronized(obj){
                if (ticket > 0) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(getName() + " : " + ticket);
                } else {
                    break;
                }
            }

        }
    }
}

public class Window2 {
    public static void main(String[] args) {
        window2 t1 = new window2();
        window2 t2 = new window2();
        window2 t3 = new window2();
        t1.setName("window1 ");
        t2.setName("window2 ");
        t3.setName("window3 ");
        t1.start();
        t2.start();
        t3.start();

    }
}
