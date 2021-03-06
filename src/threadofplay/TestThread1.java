package threadofplay;
class ThreadDemo extends Thread{
    private Thread t;
    private String threadName;
    ThreadDemo(String name){
        threadName=name;
        System.out.println("Createing "+threadName);
    }
    public void run(){
        System.out.println("running "+threadName);
        try{
            for(int i=4;i>0;i--){
                System.out.println("Thread: "+threadName+","+i);
                Thread.sleep(50);
            }
        }catch(InterruptedException e){
            System.out.println("Thread"+threadName+"interrupted.");
        }
        System.out.println("Thread "+threadName+"exiting.");
    }
    public void start(){
        System.out.println("Starting "+threadName);
        if(t==null){
            t=new Thread(this,threadName);
            t.start();
        }

    }
}
public class TestThread1 {
    public static void main(String[] args){
        ThreadDemo T1=new ThreadDemo("thread-1");
        ThreadDemo T2=new ThreadDemo("thread-2");
        T1.start();
        T2.start();
    }
}
