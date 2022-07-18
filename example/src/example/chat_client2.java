package example;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

//8001
public class chat_client2 {

	public static void main(String[] args) {
		port_chat2 pc =new port_chat2();
		pc.connect();
	}
}
class port_chat2{
	String ip="192.168.1.131";
	int port = 8001;
	InputStream is =null;
	OutputStream os =null;
	String msg ="";
	Socket sc= null;
	
	public void connect() {
		try {
			this.sc =new Socket(this.ip,this.port);
			this.is = this.sc.getInputStream();
			this.os = this.sc.getOutputStream();
			this.msg ="Ŭ���̾�Ʈ" + this.port;
			this.os.write(this.msg.getBytes());
			this.os.flush();
			Scanner sc= new Scanner(System.in);
		}catch(Exception e){
			
		}
	}
}