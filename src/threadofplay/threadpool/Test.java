package threadofplay.threadpool;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
public class Test {
    public static void main(String[] args){
        ExecutorService service =Executors.newFixedThreadPool(3);
        TaskCallable c=new TaskCallable();
        service.submit(c);
        service.submit(c);
        service.shutdown();
    }
}
