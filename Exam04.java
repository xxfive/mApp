package day01;

public class Exam04 {
	public static void main(String[] args) {
		int r=5;
		final double PI=3.14; //final�� ���� ���ϵ��� �ϴ� ��ɾ�, final�Լ��� �빮�ڷ� �ϴ°� ����.
		System.out.println("r*r*PI="+(r*r*PI));
		float f=5.0f;//4����Ʈ
		int num=10;//4����Ʈ
		f=num;//float=int ����ȯ(ĳ����,�ڵ�����ȯ) float�� int���� �� ũ�� ������,�ݴ�� num=f;�� �ȵ�.
		System.out.println("f:"+f);
		
		num=(int)f; // int<-float ����ȯ(ĳ����,���������ȯ)
		System.out.println("f:"+f);
		
		long num1=100L;
		f=num1;//float=long (�ڹٿ����� ������ �Ǽ����� ũ��. �׷��� long�� float�� �� �� �ִ�)
		
		double area=r*r*PI;
		System.out.println("������:"+area);
	}
}
