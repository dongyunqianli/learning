package employ;
import java.io.*;
public class VirtualDemo {
    public static void main(String[] args){
        Salary s=new Salary("employee:A","Boston",3,10000);
        Employee e=new Salary("employee B","Oakland",9,15000);
        System.out.println("use salary reference to refer mailCheck");
        s.mailCheck();
        System.out.println("\nuse Employee reference to refer mailCheck");
        e.mailCheck();
    }
}
