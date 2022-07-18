package example;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

//8001
public class chat_client {

	public static void main(String[] args) {
		port_chat pc =new port_chat();
		pc.connect();
	}
}
class port_chat{
	String ip="192.168.1.131";
	int port = 8001;	//�������� ������ port
	InputStream is =null;
	OutputStream os =null;
	String msg ="";
	Socket sc= null;
	
	public void connect() {
		try {
			while(true) {
			this.sc =new Socket(this.ip,this.port);
			this.is = this.sc.getInputStream();
			this.os = this.sc.getOutputStream();
			
			//������ �ش� �޼����� ����
			this.msg ="Ŭ���̾�Ʈ" + this.port;
			this.os.write(this.msg.getBytes());
			this.os.flush();
			
			Scanner sc= new Scanner(System.in);
				System.out.println("�����Է� : ");
			String say =sc.nextLine();
			this.os.write(say.getBytes());
			this.os.flush();
			System.out.println(say);
			}
		}catch(Exception e){
			
		}
	}
}