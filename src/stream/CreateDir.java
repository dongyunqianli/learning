package stream;
import java.io.File;
public class CreateDir {
    public static void main(String[] args){
        String dirname="../tmp1/user";
        File d=new File(dirname);
        d.mkdirs();
        System.out.println("result0: "+d.mkdirs());
        String dirname1="../tmp";
        d=new File(dirname1);
        System.out.println( "result: "+d.mkdir());
    }
}
