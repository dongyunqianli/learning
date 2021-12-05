package learnThread.createThread;

/**
 * @author Eila juutilainen
 * @create 2021-12-03-03 7:39
 */
class Window extends Thread{
    private static int ticket=100;

    @Override
    public void run() {
        while(true){
            if(ticket>0){
                System.out.println(getName()+" :sell,number: "+ticket);
                ticket--;
            }else{
                break;
            }
        }

    }
}
public class WindowTest {
    public static void main(String[] args) {
        Window t1 = new Window();
        Window t2 = new Window();
        Window t3 = new Window();
        t1.setName("window1<");
        t2.setName("window2<");
        t3.setName("window3<");
        t1.start();
        t2.start();
        t3.start();
    }
}
