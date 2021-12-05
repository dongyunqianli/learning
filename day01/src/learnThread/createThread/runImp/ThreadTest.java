package learnThread.createThread.runImp;

/**
 * @author Eila juutilainen
 * @create 2021-12-03-03 7:54
 */
class MyThread implements Runnable{


    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+" : "+i);
        }
    }
}
public class ThreadTest {
    public static void main(String[] args) {
        MyThread mythread = new MyThread();
        Thread t1 = new Thread(mythread);
        Thread t2 = new Thread(mythread);
        t1.start();
        t2.start();
    }

}
