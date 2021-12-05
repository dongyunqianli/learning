package threadofplay.threadpool.practice;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
public class ThreadPoolDemo {
    public static void main(String[] args)throws InterruptedException,ExecutionException{
        ExecutorService threadPool=Executors.newFixedThreadPool(2);
        MyCallable c=new MyCallable(100,200);
        MyCallable c2=new MyCallable(10,20);
        Future<Integer> result=threadPool.submit(c);
        Integer sum=result.get();
        System.out.println("sum= "+sum);

        result=threadPool.submit(c2);
        sum=result.get();
        System.out.println("sum= "+sum);


    }
}
