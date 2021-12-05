package Locky;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author Eila juutilainen
 * @create 2021-12-03-03 23:20
 */
class window4 implements Runnable{
    private int ticket=100;
    private/*if use extends Thread,add static*/ ReentrantLock lock=new ReentrantLock();
    @Override
    public void run() {
        while(true){
            try {
                lock.lock();
                if(ticket>0){
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName()+" numb: "+ticket);
                    ticket--;
                }else{
                    break;
                }
            } finally {
                lock.unlock();
            }
        }
    }
}
public class LockTest {
    public static void main(String[] args) {
        window4 w = new window4();

        Thread t1 = new Thread(w);
        Thread t2 = new Thread(w);
        Thread t3 = new Thread(w);
        t1.setName("window1: ");
        t2.setName("window2: ");
        t3.setName("window3: ");

        t1.start();
        t2.start();
        t3.start();
    }

}
