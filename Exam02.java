package day02;
import java.util.Scanner;
//�ݾ��� �Է��ϼ���
public class Exam02 {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("�ݾ��� �Է��ϼ���>>");
		int money=sc.nextInt(); //52850
		int result=money/10000; //5
		System.out.println("����:"+result);
		money=money%10000; //2850
		result=money/1000;
		System.out.println("õ��:"+result);
		money=money%1000;
		result=money/100;
		System.out.println("���:"+result);
	}
}
