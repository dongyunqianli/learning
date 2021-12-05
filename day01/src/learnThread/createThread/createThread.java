package learnThread.createThread;

/**
 * @author Eila juutilainen
 * @create 2021-12-02-02 20:55
 */
class MyThread extends Thread{
    public void run(){
        for (int i = 1; i <100 ; i++) {
//
//            System.out.println(Thread.currentThread().getName()+":"+i);
//
            if(i%7==0){
                System.out.println(Thread.currentThread().getName()+":"+i);
                System.out.println(Thread.currentThread().getPriority()+":"+i);
//                try {
//                    sleep(100);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
            }
        }
    }
    public MyThread(){}
    public MyThread(String name){
        super(name);
    }

}
public class createThread {
    public static void main(String[] args) {
        MyThread t1 = new MyThread("whatever you like");
        System.out.println(t1.getName());
        t1.setName("Thread1: ");
        t1.setPriority(Thread.MAX_PRIORITY);
        Thread.currentThread().setPriority(Thread.MIN_PRIORITY);
        t1.start();
        Thread.currentThread().setName("main Thread of fabulous");

        for (int i = 1; i < 50; i++) {
            System.out.println(Thread.currentThread().getName()+" :hello"+i);
            System.out.println(Thread.currentThread().getPriority()+" :hello"+i);
//            if(i%13==0){
//                System.out.println(t1.isAlive());
//                try{
//                    t1.join();
//                }catch(InterruptedException e){
//                    e.printStackTrace();
//                }
//
//            }
        }
        System.out.println(t1.isAlive());
    }
}
