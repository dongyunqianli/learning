package ProductTest;

/**
 * @author Eila juutilainen
 * @create 2021-12-04-04 11:23
 */
class Clerk{

}
class Producer extends Thread{
    private Clerk clerk;

    public Producer(Clerk clerk) {
        this.clerk = clerk;
    }
}
class Consumer extends Thread{
    private Clerk clerk;
    public Consumer(Clerk clerk){
        this.clerk=clerk;
    }
}
public class ProductTest {
}
