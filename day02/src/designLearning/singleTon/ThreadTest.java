package designLearning.singleTon;

/**
 * @author Eila juutilainen
 * @create 2021-12-03-03 18:49
 */
public class ThreadTest {
    public static void main(String[] args) {
        StringBuffer s1 = new StringBuffer();
        StringBuffer s2 = new StringBuffer();
        new Thread(){
            @Override
            public void run() {
                synchronized(s1){
                    s1.append("a");
                    s2.append("1");
                    synchronized (s2){
                        s1.append("b");
                        s2.append("2");
                        System.out.println(s1);
                        System.out.println(s2);

                    }
                }
            }
        }.start();
        new Thread(new Runnable(){

            @Override
            public void run() {
                synchronized(s2){
                    s1.append("c");
                    s2.append("3");
                }synchronized(s1){
                    s1.append("d");
                    s2.append("4");
                    System.out.println(s1);
                    System.out.println(s2);
                }
            }
        }).start();
    }
}
