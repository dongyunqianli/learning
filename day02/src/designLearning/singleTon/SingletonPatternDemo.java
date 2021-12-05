package designLearning.singleTon;

/**
 * @author Eila juutilainen
 * @create 2021-12-03-03 16:19
 */
public class SingletonPatternDemo {
    public static void main(String[] args) {
        SingleObject object=SingleObject.getInstance();
        object.showMessage();
    }
}
