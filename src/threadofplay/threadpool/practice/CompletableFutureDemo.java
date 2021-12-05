package threadofplay.threadpool.practice;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CountDownLatch;
public class CompletableFutureDemo {
    public static void main(String[] args) throws InterruptedException{
        long l=System.currentTimeMillis();
        CompletableFuture<Integer> completableFuture=CompletableFuture.supplyAsync(()->{
           System.out.println("perform time consuming operation");
           timeConsumingOperation();
           return 100;
        });
        completableFuture.whenComplete((result,e)->{System.out.println("result: "+result);});
        System.out.println("main thread consuming time: "+(System.currentTimeMillis()-l)+"ms");
        new CountDownLatch(1).await();

    }
    static void timeConsumingOperation(){
        try{
            Thread.sleep(1000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}
