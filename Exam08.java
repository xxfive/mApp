package day02;

public class Exam08 {
	public static void main(String[]args) {
		//1���� 10���� Ȧ���� ��
	int num=0;
	for(int i=1; i<=10; i++) {
		if(i%2==1) {
			num +=i;
		}
	}
	System.out.println("���:"+num);
	System.out.println("=====");
	int sum=0;
	for(int i=1; i<=10; i++) {
		if(i%2 !=1)continue; //continue:���������� �ȸ����� �ڵ���� ���ϰ� �ٽ� for�� ���ư���
			sum +=i;
}
	System.out.println("continue���:"+sum);
	System.out.println("=====");
	int h=0;
	for(int i=1; i<=10; i++) {
		if(i%2 !=1)break; //break:���������� ������ �ݺ����� �����
			h +=i;
}	System.out.println("break���:"+h);
	System.out.println("=====");
	
}
}