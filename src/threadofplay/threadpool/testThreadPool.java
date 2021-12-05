package threadofplay.threadpool;
import threadofplay.threadpool.TaskRunnable;

import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
public class testThreadPool {
    public static void main(String[] args){
        ExecutorService service=Executors.newFixedThreadPool(5);
        TaskRunnable task=new TaskRunnable();
        service.submit(task);
        System.out.println("----------------------");
        service.submit(task);
        service.shutdown();

    }
}
