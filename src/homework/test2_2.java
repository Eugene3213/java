package homework;

import java.util.Scanner;

public class test2_2 {

	public static void main(String[] args) {
//		�˻��� ����� �̸��� �˻��ϰ� �˴ϴ�. (���� �޼ҵ忡�� ����)
//
//		����� ����Ʈ�� ������ �����ϴ�.  (�ܺ� Ŭ���� �� �ܺ� �޼ҵ忡�� ����)
//		������, �ǿ�ȯ, �ݻ���, �赿��, �����, ������, ����ȣ, ����
//
//		�ش� ����Ʈ ������ ������ �޼ҵ� ���� �����ؾ� �մϴ�.
//		����ڰ� �Էµ� �̸��� ���� ��� "�ش� ����ڰ� �ֽ��ϴ�." ��� ����ϰ�
//		���� ��� "�ش� ����ڴ� ���� ���� �ʾҽ��ϴ�." ��� ����մϴ�.
//
//		��Ʈ : ���θ޼ҵ忡�� Scanner �۵� �ϸ�, ������ �˻��� �ܺ� Class �� �ܺ� �޼ҵ忡�� ó��
	
		Scanner sc =new Scanner(System.in);
			System.out.println("����� �̸��� �˻��Ͻÿ�");
		String a=sc.next();
		
		name.namelist(a);
			sc.close();
	}
}
class name{
	
	public static void namelist(String a) {
		String list[]= {"������","�ǿ�ȯ","�ݻ���","�赿��","�����","������","����ȣ","����"};
		
		int w=0;
		int e=list.length;
		//boolean name=true;
		while(w<e) {
			if(a.equals(list[w])) {
				System.out.println("�ش� ����ڰ� �ֽ��ϴ�");
				break;
			}
			else if(a.equals(list[w])){
				System.out.println("�ش� ����ڴ� ���� ���� �ʾҽ��ϴ�");
			}
			else {
				System.out.println("�ش� ����ڴ� ���� ���� �ʾҽ��ϴ�");
			}
			w++;
		}
	}
}