package stream;

import java.io.*;
public class BRread {
    public static void main(String[] args)throws IOException{
        char c;
        String s;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("input character,end means quit");
        do{
            s=br.readLine();
            System.out.println(s);
        }while(!s.equals("end"));
    }
}
