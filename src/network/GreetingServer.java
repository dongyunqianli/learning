package network;
import java.net.*;
import java.io.*;
public class GreetingServer extends Thread {
    private ServerSocket serverSocket;
    public GreetingServer(int port)throws IOException{
        serverSocket=new ServerSocket(port);
        serverSocket.setSoTimeout(10000);
    }
    public void run(){
        while(true){
            try{
                System.out.println("wait for remote connect,port is: "+serverSocket.getLocalPort());
                Socket server=serverSocket.accept();
                System.out.println("remote host address:"+server.getRemoteSocketAddress());

                DataInputStream in=new DataInputStream(server.getInputStream());
                System.out.println(in.readUTF());

                DataOutputStream out=new DataOutputStream(server.getOutputStream());
                out.writeUTF("thanks for connecting me: "+server.getLocalSocketAddress()+"\ngoodbye");
                server.close();
            }catch(SocketTimeoutException s){
                System.out.println("socket time out!");
                break;
            }catch(IOException e){
                e.printStackTrace();
                break;
            }
        }
    }
    public static void main(String[] args){
        int port=Integer.parseInt(args[0]);
        try{
            Thread t= new GreetingServer(port);
            t.run();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
