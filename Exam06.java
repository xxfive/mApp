package day01;
import java.util.Scanner;

public class Exam06 {
	public static void main(String[] args) {
		System.out.println("���� �Է��ϼ��� >>");
		Scanner sc=new Scanner(System.in);
		int su=sc.nextInt();
		System.out.println(su);
		if(su%2==0) {
			System.out.println("¦��");
		}else if(su%2==1) {
			System.out.println("Ȧ��");
		}
		System.out.println("���̸� �Է��ϼ���>>");
		int age=sc.nextInt();
		if(age>=20) {
			System.out.println("���尡��");
		}else if(age>=15) { //age>=15 && age<20 ���� �� �ʿ䰡 ����
			System.out.println("�θ�԰� ��������");
		}else if(age<15) {
			System.out.println("���� �Ұ���");
		}
	}
}
