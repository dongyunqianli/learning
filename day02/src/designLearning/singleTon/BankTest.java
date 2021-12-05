package designLearning.singleTon;

/**
 * @author Eila juutilainen
 * @create 2021-12-03-03 18:24
 */
public class BankTest {
}
class Bank{
    private Bank(){}
    public static Bank instance =null;
    public /*synchronized*/ static Bank getInstance(){
        if (instance==null) {
            synchronized (Bank.class) {
                if(instance==null){
                    instance=new Bank();
                }

            }

        }
        return instance;
    }
}
