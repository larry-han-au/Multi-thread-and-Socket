import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import javax.net.ServerSocketFactory;
import javax.net.ssl.SSLServerSocketFactory;


public class Server {
	
	public static void main(String[] args){
		
		System.setProperty("javax.net.ssl.keyStore", "/Users/Larry/Desktop/workshop/Certificate/master.cer");
		System.setProperty("javax.net.ssl.keyStorePassword","512288");
		
		int port=4444;
		ServerSocketFactory factory=SSLServerSocketFactory.getDefault();
		
		try(ServerSocket server =factory.createServerSocket(port)){
			while(true){
			Socket socket=server.accept();
			
			DataInputStream in = new DataInputStream(socket.getInputStream());
			DataOutputStream out = new DataOutputStream(socket.getOutputStream());
			
			String msg = in.readUTF();
			System.out.println("Received:"+msg);
			out.writeUTF("Received:"+msg);
			out.flush();
			}
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
