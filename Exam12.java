package day01;
import java.util.Scanner;

public class Exam12 {
	public static void main(String[] args ) {
		Scanner sc=new Scanner(System.in);
		System.out.println("1.�ڹ� 2.�����ͺ��̽� 3.�ȵ���̵�");
		System.out.println("�����ȣ ����>>");
		int num=sc.nextInt();
		if(num==1) {
			System.out.println("�ڹٰ���");
		}else if(num==2) {
			System.out.println("�����ͺ��̽�����");
		}else if(num==3) {
			System.out.println("�ȵ���̵����");
		}else if(num==4) {
			System.out.println("��Ÿ ����");
		}else {
			System.out.println("�����սô�");
		}
		
		//switch ��
		switch(num) {
		case 1:System.out.println("�ڹٰ���");break;
		case 2:System.out.println("�����ͺ��̽�����");break;
		case 3:System.out.println("�ȵ���̵����");break;
		case 4:System.out.println("��Ÿ ����");break;
		default :System.out.println("�����սô�");
		}
	}
}
