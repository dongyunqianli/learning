package threadofplay.threadpool;
import java.util.concurrent.Callable;
public class TaskCallable implements Callable<Object>{
    public Object call() throws Exception{
        for(int i=0;i<100;i++){
            System.out.println("custom thread is running"+i);
        }
        return null;
    }
}
