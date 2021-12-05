package designLearning.singleTon.Threadcommunication;

/**
 * sleep() and wait()
 * similarity: Once executed, the current thread can be blocked;
 *
 * difference: declaration position,sleep() is declared Thread class,wait() is delcared Object
 *sleep() any scene, wait() need synchronizing code blocks.
 * sleep() not release lock,wait() realse lock.
 * @author Eila juutilainen
 * @create 2021-12-04-04 9:44
 */
class Number implements Runnable{
    private int number=1;
    //private Object obj=new Object();
    //wait(),notify(),notifyAll()调用者，必须是同步代码块或同步方法中的同步监视器
    @Override
    public void run() {
        while (true) {
            synchronized (this/*obj*/) {
                /*this.notify() need to change to obj.notify()
                * else apper IllegalMonitorStateException*/
                notify();
                if(number<101){
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName()+" : "+number);
                    number++;

                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }else{
                    break;
                }
            }
        }
    }
}

public class communicationTest {
    public static void main(String[] args) {
        Number number = new Number();
        Thread t1 = new Thread(number);
        Thread t2= new Thread(number);
        t1.setName("thread1: ");
        t2.setName("thread2: ");
        t1.start();
        t2.start();

    }
}
