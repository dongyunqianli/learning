package learnThread.createThread.ThreadDemo;

/**
 * @author Eila juutilainen
 * @create 2021-12-02-02 21:47
 */
public class TestThread {
    public static void main(String[] args) {
//        MyThread1 t1 = new MyThread1();
//        MyThread2 t2 = new MyThread2();
//
//        t1.setName("Thread(17): ");
//        t2.setName("Thread(19): ");
//
//        t1.start();
//        t2.start();
        //anonymous subclass of Thread
        new Thread(){
            public void run(){
                for (int i = 0; i <100 ; i++) {
                    if(i%13==0){
                        System.out.println(Thread.currentThread().getName()+":"+i);
                    }
                }
            }
        }.start();
    }
}
class MyThread1 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i <1000 ; i++) {
            if(i%17==0){
                System.out.println(Thread.currentThread().getName()+" : "+i);
            }

        }
    }
}
class MyThread2 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i <1000 ; i++) {
            if(i%19==0){
                System.out.println(Thread.currentThread().getName()+" : "+i);
            }

        }
    }
}
