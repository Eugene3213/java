package example;
//Thread�� ���� class���� ������ extends(class), implements (interface)
public class thread1 {

	public static void main(String[] args) {
		//���������� ó����
		classbox cb= new classbox();
		for(int a=0; a<10 ;a++) {
			cb.run("Ŭ���� ó����Ȳ" + a);
		}
		//Thread�� �̿��Ͽ� ���� ó���� ��� �������� �������� ��.
		cpubox cp  =null;
		for(int b=0; b<10 ; b++) {
			cp=new cpubox("������ ó����Ȳ" + b);
			cp.start();
		}
		//Thread�� �̿��Ͽ� ���� ����ó�� ����̸�, ������ �߻� �ϴ��� �ش� ������ �߻��� Thread�� ����ó�� �� �� ������ ��� ó���ϴ� ����
		callbox bb=null;
		int w=0;
		String msg="";
		String msg2="";
		while(w<10) {
			if(w==5) {
				msg2="5";
			}
			else {
				msg2="";
			}
			bb=new callbox(msg+msg2);
			bb.start();
		w++;	
		}
	}
}
class callbox extends Thread{
	String callname =null;
	public callbox(String z) {
		this.callname=z;
	}
	@Override
	public void run() {
		try {
			if(this.callname.length() >0) {
				Exception ec =new Exception();
				throw ec;
			}
			else {
				System.out.println(this.callname.length());
			}
		}catch(Exception e) {
			System.out.println("�߸��� �� �߻�");
		}
	}
}
class cpubox extends Thread{
	String name =null;
	public cpubox(String a) {
		this.name =a;
	}
	@Override
	public void run() {
		System.out.println(this.name);
	}
}
class classbox{
	
	public void run(String name) {
		System.out.println(name);
	}
}