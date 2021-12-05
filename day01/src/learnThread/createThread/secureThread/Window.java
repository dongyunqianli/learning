package learnThread.createThread.secureThread;

/**
 * @author Eila juutilainen
 * @create 2021-12-03-03 13:46
 */
class windows implements Runnable{

    private int ticket=100;
    Object obj=new Object();

    @Override
    public void run() {
        while(true){
            synchronized(this){//synchronized(obj){
                if(ticket>0){
                    System.out.println(Thread.currentThread().getName()+" num: "+ticket);
                    ticket--;
                }else{
                    break;
                }
            }
        }
    }
}
public class Window {
    public static void main(String[] args) {
        windows w = new windows();
        Thread t1 = new Thread(w);
        Thread t2 = new Thread(w);
        Thread t3 = new Thread(w);
        t1.setName("windows1: ");
        t2.setName("windows2: ");
        t3.setName("windows3: ");
        t1.start();
        t2.start();
        t3.start();
    }
}
