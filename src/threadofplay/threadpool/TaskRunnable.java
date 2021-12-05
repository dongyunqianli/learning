package threadofplay.threadpool;

public class TaskRunnable implements Runnable{
    public void run(){
        for(int i=0;i<1000;i++){
            System.out.println("custom thread task in execution"+i);
        }
    }
}
