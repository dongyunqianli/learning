package stream;

import java.io.*;
public class fileStreamTest {
    public static void main(String[] args)throws IOException{
        File f=new File("a.txt");
        FileOutputStream fop=new FileOutputStream(f);
        OutputStreamWriter writer=new OutputStreamWriter(fop,"UTF-8");
        writer.append("chinese input: ");
        writer.append("\r\n");
        writer.append("english");
        writer.close();
        fop.close();

        FileInputStream fip=new FileInputStream(f);
        InputStreamReader reader=new InputStreamReader(fip,"UTF-8");
        StringBuffer sb=new StringBuffer();
        while(reader.ready()){
            sb.append((char)reader.read());
        }
        System.out.println(sb.toString());
        reader.close();
        fip.close();



    }

}
