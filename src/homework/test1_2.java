package homework;

public class test1_2 {

	public static void main(String[] args) {
//		[����2]
//		���� Class�� return �޼ҵ带 �ϳ� �����մϴ�. ��, return �޼ҵ�� ����(����)�� ó���ϴ� �޼ҵ� �Դϴ�.
//		main �޼ҵ忡�� �ش� return �޼ҵ�� ���� 5�� ���ڰ����� �����ϴ�.
//		return �޼ҵ忡���� �ش� ���ڸ� ���� �� ���ϱ� 7�� �Ͽ� ��� ���� main �޼ҵ�� ������ main���� ������� 
//		��� �ǵ��� �մϴ�. 
//		��Ʈ(getter)
	
		test1_2 t12=new test1_2();
		int sum =t12.getreturn(5*7);
			System.out.println(sum);
	}
	public int getreturn(int a) {
		int b =7;
		int sum=a*b;
		return sum;
	}
}
