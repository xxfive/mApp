package day02;

public class Exam07 {
	public static void main(String[]args) {
		//1���� 5���� ���
		for(int i=1; i<6; i++) {
			System.out.print(i+"\t");
		}
		System.out.println();
		System.out.println("----");
		//1���� 5���� ��� while (while�� ���ǹ��� ��)
		int n=1;
		while(n<6) { //while�� ������ �ȸ����� ����x
			System.out.print(n+"\t");
			n++;
		}
		System.out.println("\n----");
		//1���� 5���� ��� do~while
		int m=1;
		do { //do~while�� ������ �ȸ¾Ƶ� ������ �ѹ��� ����
			System.out.print(m+"\t");
			m++;
		}while(m<6);
	}
}
