package stream;
import oracle.jrockit.jfr.StringConstantPool;

import java.io.File;
public class DirList {
    public static void main(String[] args){
        String dirname="../../guide";
        File f1=new File(dirname);
        if(f1.isDirectory()){
            System.out.println("Directory of"+dirname);
            String s[]=f1.list();
            for(int i=0;i<s.length;i++){
                File f2=new File(dirname+"/"+s[i]);
                if(f2.isDirectory()){
                    System.out.println(s[i]+" is a directory");
                    String s1[]=f2.list();
                    for(int j=0;j<s1.length;j++){
                        File f3=new File(dirname+"/"+s[i]+"/"+s1[j]);
                        if(f3.isDirectory()){
                            System.out.println("1111"+s1[j]);
                        }else{
                            System.out.println("0000"+s1[j]);
                        }
                    }

                }else{
                    System.out.println(s[i]+" is a file ");
                }
            }
        }else{
            System.out.println(dirname+" not a directory");
        }
    }
}
