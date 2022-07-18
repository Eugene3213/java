package example;
//Thread�� ���������� ������� ���� �ȳ���
public class thread2 {

	public static void main(String[] args) {
		/*Thread�� �̿��Ͽ� �� �迭�� ���� ������������ ��� ���Ͽ� ����� ����ϴ�
		 �������α׷��� �����Ͻÿ�.	 
		 Hint: 6�̶�� �迭���� �μ������� Thread�� ����. 
		 6+5+4+3+2+1 ����������� ���		��:21
		 9+8+7+6+5+4+3+2+1 ����������� ��� 	��:45	*/
		
		int data[]= {6,9,10,15,3,17};
		int ea= data.length;
	
		plusbox pb=null;
		for(int a=0; a<ea ;a++) {
			pb=new plusbox(data[a]);
			pb.start();
		}
	}
}
class plusbox extends Thread{
	int number=0;
	public plusbox(int no) {	//Thread���� ���� ����ϱ� ���� �⺻ �޼ҵ带 �����
		this.number=no;
	}
	@Override
	public void run() {		//run �޼ҵ�� ���� �μ����� ������
//		System.out.println(this.number);
		int sum =0;
		for(int z=this.number; z>0;z--) {
			sum+=z;
		}
		System.out.println(sum);
	}
}