import java.io.*;
public class TransientPeople {
    public static void main(String[] args)throws FileNotFoundException,IOException,ClassNotFoundException{
        People a=new People("lilei",30);
        System.out.println(a);
        ObjectOutputStream os=new ObjectOutputStream(new FileOutputStream("d://people.txt"));
        os.writeObject(a);
        os.close();
        ObjectInputStream is=new ObjectInputStream(new FileInputStream("d://people.txt"));
        a=(People)is.readObject();
        System.out.println(a);
        is.close();
    }
}
class People implements Serializable{
    String name;
    transient Integer age;
    public People(String name,int age){
        this.name=name;
        this.age=age;
    }
    public String toString(){
        return "name= "+name+" ,age= "+age;
    }
}