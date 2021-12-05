package designLearning.singleTon;

/**
 * @author Eila juutilainen
 * @create 2021-12-03-03 16:16
 */
public class SingleObject {
    private static SingleObject instance=new SingleObject();
    private SingleObject(){}
    public static SingleObject getInstance(){
        return instance;
    };
    public void showMessage(){
        System.out.println("hello world?");
    }

}
