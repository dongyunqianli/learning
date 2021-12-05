package network;
import java.io.*;
import java.net.*;
public class URLConnDemo {
    public static void main(String[] args){
        try{
            URL url=new URL("https://www.runoob.com");
            URLConnection urlConnection=url.openConnection();
            HttpURLConnection connection=null;
            if(urlConnection instanceof HttpURLConnection){
                connection=(HttpURLConnection)urlConnection;
            }else{
                System.out.println("please input: url address");
                return;
            }
            BufferedReader in=new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String urlString="";
            String current;
            while((current=in.readLine())!=null){
                urlString+=current;
                System.out.println(current);
            }
            System.out.println(urlString);
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
