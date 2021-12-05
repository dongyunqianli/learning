package threadofplay;
import java.util.*;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class CallableThreadTest implements Callable<Integer> {
    public static void main(String[] args){
        CallableThreadTest ctt=new CallableThreadTest();
        FutureTask<Integer> ft=new FutureTask<>(ctt);
        for(int i=0;i<100;i++){
            System.out.println(Thread.currentThread().getName()+" value of cyclic variable"+i);
            if(i==20){
                new Thread(ft,"thread with return value").start();
            }
        }
        try{
            System.out.println("the value of child value: "+ft.get());
        }catch(InterruptedException e){
            e.printStackTrace();
        }catch(ExecutionException e){
            e.printStackTrace();
        }
    }
    public Integer call() throws Exception{
        int i=0;
        for(;i<100;i++){
            System.out.println(Thread.currentThread().getName()+" "+i);
        }
        return i;
    }
}
