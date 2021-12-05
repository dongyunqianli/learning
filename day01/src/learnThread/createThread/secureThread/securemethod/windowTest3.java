package learnThread.createThread.secureThread.securemethod;

/**
 * @author Eila juutilainen
 * @create 2021-12-03-03 15:47
 */
class window3 implements Runnable{
    private int ticket=100;
    @Override
    public void run() {
        while(true){
            show();
        }
    }
    private synchronized void show(){
        //synchronized(this){
            if(ticket>0){
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+""+ticket);
                ticket--;
            }
        //}
    }
}
public class windowTest3 {
    public static void main(String[] args) {
        window3 w = new window3();
        Thread t1 = new Thread(w);
        Thread t2 = new Thread(w);
        Thread t3 = new Thread(w);
        t1.setName("window1: ");
        t2.setName("window2: ");
        t3.setName("window3: ");
    }
}
